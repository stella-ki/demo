package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello_world(){
        return "hello, world4";

    }

    @GetMapping("/hello/{name}")
    public String hello_name(@PathVariable String name, Model model){
        model.addAttribute("name", name);
        return "hello_name"; // Thymeleaf 템플릿 이름
    }

}