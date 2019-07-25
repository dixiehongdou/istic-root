package com.istic.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by hch on 2019/7/17.
 */
@Data
@ApiModel(value = "添加部门")
public class AddDepart {

    @NotNull(message = "部门名称不能为空")
    @ApiModelProperty(value = "部门名称")
    private String departmentName;

    @NotNull(message = "部门描述不能为空")
    @ApiModelProperty(value = "部门描述")
    private String description;

    @NotNull(message = "创建人不能为空")
    @ApiModelProperty(value = "创建人")
    private String creator;
}
