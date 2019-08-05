package com.istic.controller;

import com.istic.base.Result;
import com.istic.entity.BusinessCardOrderEnum;
import com.istic.entity.ExcelBillCard;
import com.istic.entity.vo.*;
import com.istic.service.BillCardService;
import com.istic.service.BusinessCardService;
import com.istic.utils.DateTimeUtils;
import com.istic.utils.ExcelUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lql on 2019/8/5.
 */
@RestController
@Api(tags = "名片管理相关接口")
public class BusinessCardController {

    @Autowired
    private BusinessCardService businessCardService;

    @Autowired
    private BillCardService billCardService;

    @Autowired
    private HttpServletResponse response;

   /* @GetMapping("/api/getPageInitData")
    @ApiOperation(value = "获取页面枚举值")
    public Result getInitData() {
        return null;
    }*/

    @PostMapping("/api/addBusinessCard")
    @ApiOperation(value = "选择模版添加名片信息预定")
    public Result addBusinessCard(@RequestBody @Validated AddBusinessCard addBusinessCard) {
        return businessCardService.addBusinessCard(addBusinessCard);
    }

    @GetMapping("/api/queryBusinessCardOrderList")
    @ApiOperation(value = "员工名片订单详细信息")
    public Result queryBusinessCardOrderList(@RequestParam @Validated Integer status) {
        return businessCardService.queryBusinessCardOrderList(1);
    }

    @PostMapping("/api/deleteBusinessCard")
    @ApiOperation(value = "删除名片信息")
    public Result deleteBusinessCard(@RequestBody @Validated DeleteBusinessCard deleteBusinessCard) {
        return businessCardService.deleteBusinessCard(deleteBusinessCard.getIds());
    }

    @PostMapping("/api/addBillCardOrder")
    @ApiOperation(value="重新预定")
    public Result addBillCard(@RequestBody @Validated AddBillOrder addBillOrder) {
        return businessCardService.addBillCard(addBillOrder);
    }

    @GetMapping("/api/queryBillCardOrderList")
    @ApiOperation(value = "员工名片订单查询列表")
    public Result queryBillCardOrderList(@RequestBody @Validated QueryBillCardOrder queryModel) {
        return billCardService.queryBillCardOrderList(queryModel);
    }

    @PutMapping("/api/updateBillOrderStatus")
    @ApiOperation(value = "修改名片订单状态")
    public Result updateBillOrderStatus(@RequestBody @Validated UpdateBillOrderStatus updateBillOrderStatus) {
        return billCardService.updateBillOrderStatus(updateBillOrderStatus);
    }

    @PutMapping("/api/queryBillOrderDetail")
    @ApiOperation(value = "部门负责人名片订单信息详情")
    public Result queryBillOrderDetail(@RequestBody @Validated QueryBillCardOrder queryModel) {
        return billCardService.queryBillOrderDetail(queryModel);
    }

    @PutMapping("/api/updateBillOrder")
    @ApiOperation(value = "修改名片订单")
    public Result updateBillOrder(@RequestBody @Validated UpdateBillOrder updateBillOrder) {
        return billCardService.updateBillOrder(updateBillOrder);
    }

    @PutMapping("/api/examineBillOrder")
    @ApiOperation(value = "部门负责人名片订单列表审批")
    public Result examineBillOrder(@RequestBody @Validated ExamineBillOrder examineBillOrder) {
        return billCardService.examineBillOrder(examineBillOrder);
    }

    @GetMapping("/api/exportExcelDepart")
    @ApiOperation(value = "部门负责人名片订单列表结果导出")
    public void exportExcel(@Validated QueryBillCardOrder queryModel){
        List<BillCardOrderVo> resultList = (List<BillCardOrderVo>) billCardService.queryBillCardOrderList(queryModel).getData();
        List<ExcelBillCard> excelBillCardList = new ArrayList<>(resultList.size());
        ExcelBillCard billCard = null;
        BusinessCardOrderEnum enumByType = null;
        for(BillCardOrderVo billCardOrder : resultList){
            billCard = new ExcelBillCard();
            billCard.setApplyUserId(billCardOrder.getUserCode());
            billCard.setCreateTime(DateTimeUtils.dateToStr(billCardOrder.getCreateTime(), DateTimeUtils.yyyyMMddhhmmssStr));
            billCard.setBillNo(billCardOrder.getBillNo());
            enumByType = BusinessCardOrderEnum.getEnumByType(billCardOrder.getStatus());
            billCard.setStatus(enumByType == null ? "" : enumByType.getName());
            billCard.setUserName(billCardOrder.getUserName());
            excelBillCardList.add(billCard);
        }
        long t1 = System.currentTimeMillis();
        ExcelUtils.writeExcel(response, excelBillCardList, ExcelBillCard.class, "名片订单列表");
        long t2 = System.currentTimeMillis();
        System.out.println(String.format("write over! cost:%sms", (t2 - t1)));
    }



}
