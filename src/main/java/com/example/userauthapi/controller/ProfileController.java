package com.example.userauthapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProfileController {

    @GetMapping("/profile")
    @ResponseBody
    public String profile() {
        return "Добро пожаловать в профиль!";
    }
}
