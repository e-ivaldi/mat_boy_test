package com.somethingelse.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController
{
    @RequestMapping("/**")
    public String xxx(){
        return "I am a simple controller";
    }
}
