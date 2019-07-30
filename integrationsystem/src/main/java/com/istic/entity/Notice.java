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
public class Notice {
    /**
     * 类别id
     */
    @Id
    private String id;

    /**
     * 用户id
     */
    private String uid;

    /**
     * 类别id
     */
    @Column(name = "category_id")
    private String categoryId;

    /**
     * 通知标题
     */
    private String subject;

    /**
     * 创建时间
     */
    @Column(name = "created_date")
    private Date createdDate;

    /**
     * 修改时间
     */
    @Column(name = "modified_date")
    private Date modifiedDate;

    /**
     * 点击量
     */
    private Integer hits;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 通知内容
     */
    private String content;
}