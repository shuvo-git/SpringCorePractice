package com.jobayed.web.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticesController {
    @RequestMapping("/")
    public String showHome(){
        System.out.println("From Notice Controller.........");
        return "home";
    }
}
