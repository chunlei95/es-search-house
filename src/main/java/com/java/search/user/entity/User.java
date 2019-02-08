package com.java.search.user.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 星期六 二月,2019
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;

    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 状态, 0: 正常 1: 封禁
     */
    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "last_login_time")
    private Date lastLoginTime;

    @Column(name = "last_update_time")
    private Date lastUpdateTime;

}
