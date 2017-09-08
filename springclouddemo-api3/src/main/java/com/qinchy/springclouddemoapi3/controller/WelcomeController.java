package com.qinchy.springclouddemoapi3.controller;

import com.qinchy.springclouddemoapi3.integration.ServiceCallBackClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sayhi")
public class WelcomeController {

    private Logger log = LoggerFactory.getLogger(WelcomeController.class);

    @Autowired
    private ServiceCallBackClient scbc;

    //实际调用了api1模块的/hello/welcome/{name}
    @RequestMapping(path = "/welcome/{name}", method = RequestMethod.GET)
    public String welcome(@PathVariable String name){
        log.info("进入welcome方法");
        return scbc.welcome(name);
    }
}
