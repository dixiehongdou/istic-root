package com.istic.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/07/17
*/
@Table(name = "business_card_template")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BusinessCardTemplate {
    @Id
    private Integer id;
}