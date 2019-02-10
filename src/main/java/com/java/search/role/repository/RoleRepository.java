package com.java.search.role.repository;

import com.java.search.role.entity.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 二月 星期五, 2019
 */
public interface RoleRepository extends CrudRepository<Role, Long> {

    List<Role> findByUserId(Long userId);

}
