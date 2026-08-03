package com.eDigest.myFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class car {

    @Autowired
    private engine engine;

    @GetMapping("/car")
    public String car(){
        return engine.fun();
    }
}
