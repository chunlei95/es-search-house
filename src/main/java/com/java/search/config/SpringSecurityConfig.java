//package com.java.search.config;
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
////@Configuration
//public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
////                .authorizeRequests()
////                .antMatchers("/static/**")
////                .permitAll()
////                .and()
////                .authorizeRequests()
////                .antMatchers("/users/**")
////                .authenticated()
////                .and()
////                .formLogin()
////                .loginPage("classpath:/user/login.html")
////                .successForwardUrl("/user/index")
////                .and()
////                .authorizeRequests()
////                .antMatchers("/admin/**")
////                .hasRole("ADMIN")
////                .and()
////                .formLogin()
////                .loginPage("/admin/login.html")
////                .successForwardUrl("/admin/center")
////                .and()
//                .authorizeRequests()
//                .anyRequest()
//                .permitAll()
//        ;
//    }
//}
