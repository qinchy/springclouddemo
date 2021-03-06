package com.qinchy.springclouddemoapi2.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/greeting")
public class GreetingController {

    @RequestMapping(path="/hello/{name}")
    public String hello(@PathVariable String name){
        return "hello:"+name;
    }

    @RequestMapping(path="/welcome")
    public String welcome(){
        return "欢迎你！";
    }
}
