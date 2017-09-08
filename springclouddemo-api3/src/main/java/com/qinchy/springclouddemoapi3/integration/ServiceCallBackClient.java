package com.qinchy.springclouddemoapi3.integration;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("api1")
public interface ServiceCallBackClient {

    //接口中用PathVariable需要指定value的值
    @RequestMapping(path = "/api1/hello/welcome/{name}", method = RequestMethod.GET)
    public String welcome(@PathVariable(value="name") String name);
}
