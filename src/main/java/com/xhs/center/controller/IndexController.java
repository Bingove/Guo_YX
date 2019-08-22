package com.xhs.center.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @projectName Monitor_Management
 * @Author 常冬军
 * @Date 2019/4/10 0010上午 10:35
 * @title: IndexController
 * @ToDo
 */
@Controller
public class IndexController {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/register")
    public String register() {
        return "register";
    }
}
