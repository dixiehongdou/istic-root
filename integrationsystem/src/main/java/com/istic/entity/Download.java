package com.istic.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/07/30
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Download {
    private String id;

    private String name;

    private String uid;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    private String type;

    private Double size;

    @Column(name = "category_id")
    private String categoryId;

    private Integer sort;
}