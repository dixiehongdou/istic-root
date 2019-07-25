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
public class UpdateDepart {
    @NotNull(message = "id不能为空")
    private Integer id;
    @NotNull(message = "部门名称不能为空")
    @ApiModelProperty(value = "部门名称")
    private String departmentName;

    @NotNull(message = "description不能为空")
    @ApiModelProperty(value = "部门描述")
    private String description;

}
