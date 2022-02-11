package com.mycv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//RestController // use when not returning file name (like in this case "examples")
public class CVController {

    @GetMapping("/aboutme")
    public String showAboutMe(){
        System.out.println("user is visiting about me page");

        return "aboutme";
    }

    @GetMapping("/experience")
    public String showExperience(){
        return "experience";
    }


    @GetMapping("/contacts")
    public String showContacts (){
        return "contacts";
    }

    @GetMapping ("/portfolio")
    public String showPortfolio (){
        return "portfolio";
    }
}
