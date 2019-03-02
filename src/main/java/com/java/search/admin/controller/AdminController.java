package com.java.search.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 星期日 二月,2019
 */
@Controller
public class AdminController {

    @GetMapping("/admin/center")
    public String center() {
        return "admin/center";
    }

    @GetMapping("/admin/welcome.html")
    public String welcome() {
        return "admin/welcome";
    }

    @GetMapping("/admin/login")
    public String login() {
        return "admin/login";
    }

    @GetMapping("/admin/add/house")
    public String addHouse() {
        return "/admin/house-add";
    }

}
