package com.java.search.role.service.impl;

import com.java.search.role.entity.Role;
import com.java.search.role.repository.RoleRepository;
import com.java.search.role.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 二月 星期五, 2019
 */
@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findByUserId(Long userId) {
        return roleRepository.findByUserId(userId);
    }
}
