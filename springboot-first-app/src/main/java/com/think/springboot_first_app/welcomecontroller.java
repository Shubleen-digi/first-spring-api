package com.think.springboot_first_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomecontroller {

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome , to spring boot world! this is my first spring boot task. ";
    }
}
