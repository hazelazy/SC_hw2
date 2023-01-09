package com.example.demo;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController{
    @GetMapping("/sayhello")
    public String sayHello(@RequestParam(value = "name",defaultValue = "xxy") String name){
        Person pn = new Person();
        pn.setName(name);
        return pn.sayHello();
    }
}
