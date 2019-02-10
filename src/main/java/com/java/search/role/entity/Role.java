package com.java.search.role.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 二月 星期五, 2019
 */
@Data
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    private String name;

}
