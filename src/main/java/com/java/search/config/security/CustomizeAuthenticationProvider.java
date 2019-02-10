//package com.java.search.config.security;
//
//import com.java.search.role.service.RoleService;
//import com.java.search.user.entity.User;
//import com.java.search.user.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Service;
//
//import java.util.Objects;
//
///**
// * @author xzmeasy
// * @version 1.0
// * @since 二月 星期五, 2019
// */
//public class CustomizeAuthenticationProvider implements AuthenticationProvider {
//
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private RoleService roleService;
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        String principal = (String) authentication.getPrincipal();
//        String credentials = (String) authentication.getCredentials();
//        User user = userService.getUserByName(principal);
//        if (Objects.isNull(user)) {
//            throw new AuthenticationCredentialsNotFoundException("不存在该用户");
//        }
//
//        UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) authentication;
//        boolean authenticated = authentication.isAuthenticated();
//        if (authenticated) {
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//            return token;
//        }
//        throw new AuthenticationCredentialsNotFoundException("用户认证失败");
//    }
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return true;
//    }
//}
