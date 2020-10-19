package com.kk.kkapi.controller;

import com.kk.kkapi.service.FeignHiService;
import com.kk.kkapi.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HiService hiService;

    @Autowired
    private FeignHiService feignHiService;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return hiService.hiService(name);
    }


    @RequestMapping("/feignhi")
    public String feignhi(@RequestParam String name){
        return feignHiService.sayHiClient(name);
    }

}
