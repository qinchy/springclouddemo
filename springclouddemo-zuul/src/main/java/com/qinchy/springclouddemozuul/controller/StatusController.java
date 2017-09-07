package com.qinchy.springclouddemozuul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/status")
public class StatusController {

    @RequestMapping(path = "/info",method = RequestMethod.GET)
    public String info(){
        return "zuul is running";
    }
}
