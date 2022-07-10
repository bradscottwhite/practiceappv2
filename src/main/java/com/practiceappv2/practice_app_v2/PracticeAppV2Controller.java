package com.practiceappv2.practice_app_v2;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeAppV2Controller {
    
    @CrossOrigin(origins = "https://localhost:3030/")
    @RequestMapping("/hello")
    public String hello() {
        return "Howdy!";
    }
}
