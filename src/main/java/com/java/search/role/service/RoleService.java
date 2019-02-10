package com.java.search.role.service;

import com.java.search.role.entity.Role;

import java.util.List;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 二月 星期五, 2019
 */
public interface RoleService {

    List<Role> findByUserId(Long userId);

}
