package com.eazypeazy.eazyschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

    @RequestMapping(value = {"" ,"/" ,"/home"})
    public String displayHomePage (){
        return "home.html";
    }
}
