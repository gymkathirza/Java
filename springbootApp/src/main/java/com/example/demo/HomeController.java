package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }


    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("founder", "Founded by Kathiresan Moorthy");
        return "home";
    }

    @RequestMapping("/ping")
    public String healthCheck(){
        return "ping.html";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "contact.html";
    }
}
