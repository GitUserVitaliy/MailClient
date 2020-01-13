package com.cko.sampleSpringProject.controller;

import com.cko.sampleSpringProject.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    MailService mailService;

    @GetMapping("/login")
    public String showLoginPage(){
        return "LoginPage";
    }
    @GetMapping("/")
    public String showMainPage(){
        return "MainPage";
    }
    @GetMapping("/test")
    public void sendTestMessage(){
        mailService.sendSimpleMessage("chernickovvit@yandex.ru","@Started","Simple message...");https://github.com/GitUserVitaliy/MailClient.git
    }
}
