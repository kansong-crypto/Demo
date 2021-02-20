package com.example.demo.web;


import com.example.demo.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyIndex {

    @Autowired
    public Config config;

    @RequestMapping("/index")
    public String index() {
        return "----------- hello spring boot ----------\n" + config.print();
    }
}
