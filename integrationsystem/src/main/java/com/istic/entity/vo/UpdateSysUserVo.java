package com.istic.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: sunwy
 * @Date: 2019/8/1 15:27
 */
@Data
@ApiModel(value = "OA用户")
public class UpdateSysUserVo {
    @NotNull(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名")
    private  String username;
    @NotNull(message = "状态不能为空")
    @ApiModelProperty(value = "状态 0在职 1离职")
    private  Integer status;
}
