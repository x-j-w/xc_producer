package com.daling.producer.fallback;

import com.daling.producer.api.InnerDemoApi;
import com.daling.producer.dto.DemoDto;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class InnerDemoApiFallbackFactory implements FallbackFactory<InnerDemoApi> {

    @Override
    public InnerDemoApi create(Throwable e) {
        return new InnerDemoApi() {
            @Override
            public List<DemoDto> queryDemoDtoList() {
                log.error(e.getMessage(), e);
                return null;
            }
        };
    }
}