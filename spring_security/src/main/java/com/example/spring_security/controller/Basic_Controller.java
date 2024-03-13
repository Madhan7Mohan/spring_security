package com.example.spring_security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Basic_Controller {

    @GetMapping("/")
    public  String getmessage(){
        return ("<h1>Rara Labbe </h1>");
    }

    @GetMapping("/user")
    public  String getuser(){
        return ("<h1>Rara user </h1>");
    }
    @GetMapping("/admin")
    public  String getadmin(){
        return ("<h1>Rara admin </h1>");
    }
}
