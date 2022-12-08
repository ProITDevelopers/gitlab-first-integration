package com.proit.com.gitlabfirstintegration;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String helloworld(){
        return "Hello world!, today is "+ LocalDateTime.now();
    }

}
