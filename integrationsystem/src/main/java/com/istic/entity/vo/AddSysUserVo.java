package com.istic.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 10:53
 */
@Data
@ApiModel(value = "OA用户")
public class AddSysUserVo {
    @NotNull(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名")
    private String username;
    @NotNull(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名")
    private String password;
    @NotNull(message = "密码不能为空")
    @ApiModelProperty(value = "密码")
    private String fullname;
    @NotNull(message = "全名称不能为空")
    @ApiModelProperty(value = "全名称")
    private String name;
    @NotNull(message = "电话不能为空")
    @ApiModelProperty(value = "电话")
    private String tel;
    @NotNull(message = "状态不能为空")
    @ApiModelProperty(value = "状态")
    private Integer status;
    @NotNull(message = "邮箱用户名不能为空")
    @ApiModelProperty(value = "邮箱用户名")
    private String emailUsername;
    @NotNull(message = "部门名称不能为空")
    @ApiModelProperty(value = "部门名称")
    private String department;
}
