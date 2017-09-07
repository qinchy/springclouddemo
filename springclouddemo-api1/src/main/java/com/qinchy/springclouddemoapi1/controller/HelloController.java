package com.qinchy.springclouddemoapi1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {

    @RequestMapping(path="/greeting/{name}")
    public String greeting(@PathVariable String name){
        return "欢迎您："+name;
    }

    @RequestMapping(path="/welcome")
    public String welcome(){
        return "欢迎你！";
    }
}
