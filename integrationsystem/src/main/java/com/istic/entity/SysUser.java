package com.istic.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/07/30
*/
@Table(name = "sys_user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysUser {
    @Id
    private String id;

    private String username;

    private String password;

    private String fullname;

    private String name;

    private String tel;

    private String email;

    private String addr;

    private String description;

    private Integer pwdedit;

    private Integer pwdoverdue;

    private Integer status;

    private String pan;

    private Integer postid;

    @Column(name = "email_password")
    private String emailPassword;

    private String panuse;

    @Column(name = "email_username")
    private String emailUsername;

    private Integer sort;

    private String ip;

    private String mac;
}