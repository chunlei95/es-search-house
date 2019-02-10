//package com.java.search.config.security;
//
//import com.java.search.base.SpringApplicationContextUtils;
//import com.java.search.role.entity.Role;
//import com.java.search.role.service.RoleService;
//import com.java.search.user.entity.User;
//import com.java.search.user.service.UserService;
//import org.springframework.beans.BeanUtils;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * @author xzmeasy
// * @version 1.0
// * @since 二月 星期五, 2019
// */
//public class LoginUserDetailServiceImpl implements UserDetailsService {
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        UserService userService = SpringApplicationContextUtils.getBean(UserService.class);
//        User user = userService.getUserByName(s);
//        LoginUserDetails loginUserDetails = new LoginUserDetails();
//        BeanUtils.copyProperties(user, loginUserDetails);
//        RoleService roleService = SpringApplicationContextUtils.getBean(RoleService.class);
//        List<Role> roles = roleService.findByUserId(user.getId());
//        List<SimpleGrantedAuthority> authorityList = roles.stream().map(role -> new SimpleGrantedAuthority("ROLE_" + role.getName())).collect(Collectors.toList());
//        loginUserDetails.setAuthorities(authorityList);
//        return loginUserDetails;
//    }
//}
