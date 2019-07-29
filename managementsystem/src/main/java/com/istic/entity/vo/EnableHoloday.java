package com.istic.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by hch on 2019/7/29.
 */
@Data
@ApiModel(value = "启用禁用假期类型")
public class EnableHoloday {
    @NotNull(message = "id列表不能为空")
    @ApiModelProperty(value = "id列表")
    private List<String> idList;
    @NotNull(message = "status不能为空")
    @ApiModelProperty(value = "启用1 禁用0")
    private Byte status;
}
