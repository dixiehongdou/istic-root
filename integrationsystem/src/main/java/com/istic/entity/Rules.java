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
public class Rules {
    @Id
    private String id;

    private String uid;

    @Column(name = "category_id")
    private String categoryId;

    private String subject;

    @Column(name = "created_datetime")
    private Date createdDatetime;

    @Column(name = "modified_datetime")
    private Date modifiedDatetime;

    private Integer hits;

    private Integer sort;

    private String content;
}