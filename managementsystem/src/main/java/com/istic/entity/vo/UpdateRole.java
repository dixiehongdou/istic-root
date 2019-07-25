package com.istic.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by hch on 2019/7/25.
 */
@Data
@ApiModel(value = "修改角色")
public class UpdateRole {
    @NotNull(message = "id不能为空")
    private Integer id;
    @NotNull(message = "角色名称不能为空")
    @ApiModelProperty(value = "角色名称")
    private String roleName;

    @NotNull(message = "description不能为空")
    @ApiModelProperty(value = "角色描述")
    private String description;

}
