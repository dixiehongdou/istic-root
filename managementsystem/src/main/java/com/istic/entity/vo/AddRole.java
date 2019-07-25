package com.istic.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

/**
 * Created by hch on 2019/7/17.
 */
@Data
@ApiModel(value = "添加角色")
public class AddRole {

    @NotNull(message = "角色名称不能为空")
    @ApiModelProperty(value = "角色名称")
    private String roleName;

    @NotNull(message = "description不能为空")
    @ApiModelProperty(value = "角色描述")
    private String description;

    @NotNull(message = "创建人不能为空")
    @ApiModelProperty(value = "创建人")
    private String creator;
}
