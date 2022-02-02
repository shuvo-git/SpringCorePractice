package com.jobayed.web.notice.controller;

import com.jobayed.web.notice.model.Notice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHome() {
        return "home";
    }
}
