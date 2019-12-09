package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.model.IModel;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myvar","Say hello to the people.");
        return "hometemplate";

    }
}

