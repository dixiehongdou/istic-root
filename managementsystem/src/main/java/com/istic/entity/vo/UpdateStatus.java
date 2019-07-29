package com.istic.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by hch on 2019/7/29.
 */
@Data
public class UpdateStatus {
    @NotNull(message = "id不能为空")
    @ApiModelProperty(value = "请假订单id")
    private Integer id;
    @NotNull(message = "操作人不能为空")
    @ApiModelProperty(value = "操作人")
    private String operator;
    @NotNull(message = "审批状态不能为空")
    @ApiModelProperty(value = "审批状态  0 待审批 1审批通过  2已撤回  3 审批未通过 4已退回")
    private Byte status;
    @ApiModelProperty(value = "审批意见")
    private String idea;

}
