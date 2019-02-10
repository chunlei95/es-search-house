//package com.java.search.config.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * @author xzmeasy
// * @version 1.0
// * @since 星期日 二月,2019
// */
//@Configuration
//public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                    .antMatchers("/static/**").permitAll()
//                    .antMatchers("/admin/login").permitAll()
//                    .antMatchers("/users/login").permitAll()
//                    .antMatchers("/admin/**").hasRole("ADMIN")
//                    .antMatchers("/users/**").hasAnyRole("ADMIN", "USER")
//                    .antMatchers("/api/users/**").hasAnyRole("ADMIN", "USER")
//                    .anyRequest().permitAll()
//                .and()
//                    .authenticationProvider(new CustomizeAuthenticationProvider())
//                    .userDetailsService(new LoginUserDetailServiceImpl())
//                    .csrf().disable()
//                    .formLogin().loginPage("/login")
//                .and()
//                    .httpBasic().disable()
//        ;
//    }
//}
