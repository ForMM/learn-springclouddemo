package com.kk.kkapi.service;

import com.kk.kkapi.service.impl.FeignHiserviceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "account-client",fallback = FeignHiserviceHystrix.class)
public interface FeignHiService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiClient(@RequestParam(value = "name") String name);

}
