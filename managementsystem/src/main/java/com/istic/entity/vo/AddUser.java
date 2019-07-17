package com.istic.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by hch on 2019/7/17.
 */
@Data
@ApiModel(value = "添加员工")
public class AddUser {
    @NotNull(message = "username不能为空")
    @ApiModelProperty(value = "员工姓名")
    private String username;
    @ApiModelProperty(value = "状态 0禁用 1启用",example = "0")
    @NotNull(message = "status不能为空")
    private Byte status;
    @NotNull(message = "员工Code不能为空")
    private String usercode;
    @NotNull(message = "邮箱不能为空")
    private String mail;
    @NotNull(message = "departmentId不能为空")
    private Integer departmentId;
    @NotNull(message = "roleId不能为空")
    private Integer roleId;
    @NotNull(message = "考勤类型不能为空")
    @ApiModelProperty(value = "考勤类型")
    private Integer attendanceType;
}
