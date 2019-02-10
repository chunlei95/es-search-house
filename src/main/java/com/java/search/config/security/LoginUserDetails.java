//package com.java.search.config.security;
//
//import lombok.Data;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.Date;
//import java.util.List;
//
///**
// * @author xzmeasy
// * @version 1.0
// * @since 二月 星期五, 2019
// */
//@Data
//public class LoginUserDetails implements UserDetails {
//
//    private Long id;
//
//    private String name;
//
//    private String password;
//
//    private String email;
//
//    private String phoneNumber;
//
//    /**
//     * 头像
//     */
//    private String avatar;
//
//    /**
//     * 状态, 0: 正常 1: 封禁
//     */
//    private Integer status;
//
//    private Date createTime;
//
//    private Date lastLoginTime;
//
//    private Date lastUpdateTime;
//
//    private List<? extends GrantedAuthority> authorities;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return this.authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return this.password;
//    }
//
//    @Override
//    public String getUsername() {
//        return this.name;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
