package com.javabunga.sample.spring.controller;

import com.javabunga.sample.spring.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ahmet on 15.01.2017.
 */
@Controller
@EnableAutoConfiguration
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping(path = "/helloworld")
    @ResponseBody
    public String printHelloWorldToConsole() {
        helloWorldService.printHelloWorld();

        return "See console for the result";
    }

}
