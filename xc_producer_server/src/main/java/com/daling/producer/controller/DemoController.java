package com.daling.producer.controller;

import com.daling.producer.service.IDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private IDemoService demoService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        log.info("demo test log");
        log.info(demoService.getName());
        return "demo";
    }
}