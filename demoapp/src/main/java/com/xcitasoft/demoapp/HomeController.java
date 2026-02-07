package com.xcitasoft.demoapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class HomeController{

    @RequestMapping("/")
    public String launch(Model model){
        model.addAttribute("name", "Kathir");
        return "index.html";
    }

}