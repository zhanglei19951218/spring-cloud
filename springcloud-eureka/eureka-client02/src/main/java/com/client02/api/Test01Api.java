package com.client02.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "EUREKAE-CLIENT01",url = "http://localhost:8083")
public interface Test01Api {

    @RequestMapping("test01")
    public String test01();
}
