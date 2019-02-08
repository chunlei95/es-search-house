package com.java.search.user.service.impl;

import com.java.search.user.repository.UserRepository;
import com.java.search.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 星期六 二月,2019
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
