package com.jobayed.web.notice.controller;

import com.jobayed.web.notice.model.Notice;
import com.jobayed.web.notice.service.NoticesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.net.ConnectException;
import java.util.List;

@Controller
public class NoticesController {

    private NoticesService noticesService;
    
    @ExceptionHandler(DataAccessException.class)
    public String handleDataAccessException(DataAccessException e){
    	return "error";
    }

    @ExceptionHandler(ConnectException.class)
    public String handleDatabaseConnectionException(ConnectException e){
        return "Error";
    }

    @Autowired
    public void setNoticesService(NoticesService noticesService) {
        this.noticesService = noticesService;
    }

    @RequestMapping("/all")
    public String showAllNotices(Model model) {
        noticesService.throwTestException();
        List<Notice> notices = noticesService.getCurrentNotices();
        model.addAttribute("notices", notices);
        return "notices";
    }

    @RequestMapping("/create")
    public String createNotice(Model model) {
        model.addAttribute("notice", new Notice());
        return "create-notice";
    }

    @RequestMapping(value = "/store", method = RequestMethod.POST)
    public String storeNotice(Model model, @Valid Notice notice, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "create-notice";
        }
        noticesService.createNotice(notice);
        return "notice-created";
    }

    
}
