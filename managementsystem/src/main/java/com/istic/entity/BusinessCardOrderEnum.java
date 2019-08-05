package com.istic.entity;


public enum BusinessCardOrderEnum {
//0.待提交 待审批 待受理 已否决 已受理 已退回 已撤单 已完成

complete(1,"已审批"),
    cancel(2,"待审批"),
    expire(3,"已失效"),
    force(4,"已完成");

    private Integer code;
    private String name;

    BusinessCardOrderEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static BusinessCardOrderEnum getEnumByType(int code) {
        for (BusinessCardOrderEnum bt : values()) {
            if (bt.code == code) {
                return bt;
            }
        }
        return null;
    }}

   /* User(1, BusinessType.USER_BUSINESS),
    Order(2, BusinessType.ORDER_BUSINESS);

    private int type;
    private BusinessType businessType;

    private BusinessEnum(int type, BusinessType businessType) {
        this.type = type;
        this.businessType = businessType;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public BusinessType getBusinessType() {
        return businessType;
    }

    public void setBusinessType(BusinessType businessType) {
        this.businessType = businessType;
    }

    public static BusinessEnum getEnumByType(int type) {
        for (BusinessEnum bt : values()) {
            if (bt.type == type) {
                return bt;
            }
        }
        return null;
    }
*/

