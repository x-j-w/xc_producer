package com.daling.producer.api;

import com.daling.producer.dto.DemoDto;
import com.daling.producer.fallback.InnerDemoApiFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "xcproducer", url = "http://localhost:8888", path = "/xc_producer/inner/demo", fallback = InnerDemoApiFallbackFactory.class)
public interface InnerDemoApi {

    @RequestMapping(value = "queryDemoDtoList.do")
    List<DemoDto> queryDemoDtoList();
}