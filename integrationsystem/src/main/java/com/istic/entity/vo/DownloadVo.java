package com.istic.entity.vo;

import lombok.Data;

import java.util.Date;

/**
 * @Author: sunwy
 * @Date: 2019/8/1 15:42
 */
@Data
public class DownloadVo {
    private String id;
    private String name;
    private Date createDate;
    private String type;
    private Double size;
    private String categoryId;
    private Integer sort;
    private String downloadUrl;
}
