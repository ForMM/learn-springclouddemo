package com.kk.kkapi.service.impl;

import com.kk.kkapi.service.FeignHiService;
import org.springframework.stereotype.Component;

@Component
public class FeignHiserviceHystrix implements FeignHiService {

    @Override
    public String sayHiClient(String name) {
        return "sorry, "+name;
    }
}
