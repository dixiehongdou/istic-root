package com.istic.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by hch on 2019/7/29.
 */
@Data
public class AddHolidayType {
    @NotNull(message = "编码不能为空")
    @ApiModelProperty(value = "编码")
    private String code;
    @NotNull(message = "编码不能为空")
    @ApiModelProperty(value = "编码")
    private String nameCn;
    private String nameEn;
    @ApiModelProperty(value = "附加值")
    private String valueAdd;
    @ApiModelProperty(value = "备注中文")
    private String noteCn;
    @ApiModelProperty(value = "备注英文")
    private String noteEn;

    @NotNull(message = "创建人不能为空")
    @ApiModelProperty(value = "创建人")
    private String creator;

}
