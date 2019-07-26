package com.istic.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by hch on 2019/7/26.
 */
@Data
public class AddLeaveOrder {
    @NotNull(message = "请假时间不能为空")
    @ApiModelProperty(value = "请假开始时间")
    private Date startTime;
    @NotNull(message = "请假时间不能为空")
    @ApiModelProperty(value = "请假结束时间")
    private Date endTime;
    @NotNull(message = "请假类型不能为空")
    @ApiModelProperty(value = "请假类型不能为空")
    private Integer type;
    @NotNull(message = "申请人code不能为空")
    @ApiModelProperty(value = "申请人code")
    private String applyUsercode;
    @NotNull(message = "申请人name不能为空")
    @ApiModelProperty(value = "申请人name")
    private String applyUsername;
    @NotNull(message = "请假原因不能为空")
    @ApiModelProperty(value = "请假原因")
    private String reason;
    @NotNull(message = "联系电话不能为空")
    @ApiModelProperty(value = "联系电话")
    private String phone;
    @NotNull(message = "附件地址不能为空")
    @ApiModelProperty(value = "附件地址")
    private String attachment;
    @NotNull(message = "审批人code不能为空")
    @ApiModelProperty(value = "审批人code")
    private String approverUsercode;
    @NotNull(message = "审批人name不能为空")
    @ApiModelProperty(value = "审批人name")
    private String approverUsername;
    @NotNull(message = "部门id不能为空")
    @ApiModelProperty(value = "部门id")
    private Integer departmentId;
    @NotNull(message = "操作人不能为空")
    @ApiModelProperty(value = "操作人")
    private String operator;
}
