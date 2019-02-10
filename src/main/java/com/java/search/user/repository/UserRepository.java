package com.java.search.user.repository;

import com.java.search.user.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 星期六 二月,2019
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User getByName(String username);

}
