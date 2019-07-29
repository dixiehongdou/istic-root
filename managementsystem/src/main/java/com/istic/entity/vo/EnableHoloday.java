package com.istic.entity.vo;

import lombok.Data;

import java.util.List;

/**
 * Created by hch on 2019/7/29.
 */
@Data
public class EnableHoloday {
    private List<String> idList;
    private Byte status;
}
