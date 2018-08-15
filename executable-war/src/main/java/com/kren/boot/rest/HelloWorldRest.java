package com.kren.boot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kren.boot.service.TestService;

@RestController
public class HelloWorldRest {

    @Autowired
    private TestService testService;

    @RequestMapping("/")
    String home() {
	return testService.test();
    }
}