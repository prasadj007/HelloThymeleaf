package com.example.hellothyme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloThymeController {
    @GetMapping("/web")
    public String hello(){
        return "Hello";
    }
    @GetMapping("/message")
    public String message(Model model){
        model.addAttribute("message","Welcome User to Custom Message");
        return "Message";
    }
}
