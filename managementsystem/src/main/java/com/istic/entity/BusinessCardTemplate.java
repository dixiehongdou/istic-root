package com.istic.entity;

import javax.persistence.*;

@Table(name = "business_card_template")
public class BusinessCardTemplate {
    @Id
    private Integer id;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }
}