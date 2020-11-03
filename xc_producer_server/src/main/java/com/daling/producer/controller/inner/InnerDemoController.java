package com.daling.producer.controller.inner;

import com.daling.producer.api.InnerDemoApi;
import com.daling.producer.dto.DemoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/inner/demo")
public class InnerDemoController implements InnerDemoApi {

    @Override
    public List<DemoDto> queryDemoDtoList() {
        DemoDto demoDto = new DemoDto();
        demoDto.setName("demo");
        List<DemoDto> demoDtoList = new ArrayList<>();
        demoDtoList.add(demoDto);
        return demoDtoList;
    }
}