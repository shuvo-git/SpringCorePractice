package jobayed.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticesController {
    @RequestMapping("/")
    public String getHello(){
        System.out.println("From Notices Controller...........");
        return "home";
    }
}
