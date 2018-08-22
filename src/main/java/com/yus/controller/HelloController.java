package com.yus.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public  String sayhello(){
       Logger logger= LoggerFactory.getLogger(HelloController.class);
       logger.info("访问hello");
        return "hello";
    }
}
