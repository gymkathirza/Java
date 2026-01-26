package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("founder", "Found by Kathiresan Moorthy");
        return "home";
    }

    @RequestMapping("/ping")
    public String healthCheck(){
        return "ping";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "thankyou";
    }
}
