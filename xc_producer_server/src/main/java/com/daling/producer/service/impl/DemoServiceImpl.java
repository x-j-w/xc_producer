package com.daling.producer.service.impl;

import com.daling.producer.service.IDemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements IDemoService {

    @Override
    public String getName() {
        return "demo";
    }
}