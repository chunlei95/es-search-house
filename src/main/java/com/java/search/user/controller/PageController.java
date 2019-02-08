package com.java.search.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 星期日 二月,2019
 */
@Controller
public class PageController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/404")
    public String notFound() {
        return "404";
    }

    @RequestMapping(value = "/403")
    public String acccssDenied() {
        return "403";
    }

    @RequestMapping(value = "/500")
    public String internalServerError() {
        return "500";
    }

}
