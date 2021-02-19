package com.linkus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linkus.service.ITestService;

@RestController
public class TestController {
	@Autowired
	private ITestService iTestService;
	
    @RequestMapping("/")
    String home() {
        return iTestService.home();
    }
}
