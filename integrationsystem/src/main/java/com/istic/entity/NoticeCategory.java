package com.istic.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/07/30
*/
@Table(name = "notice_category")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NoticeCategory {
    /**
     * 通知主键
     */
    @Id
    private String id;

    /**
     * 部门Id
     */
    private String oid;

    /**
     * 类别名称
     */
    private String name;

    /**
     * 备注
     */
    private String comment;

    /**
     * 排序
     */
    private Integer sort;
}