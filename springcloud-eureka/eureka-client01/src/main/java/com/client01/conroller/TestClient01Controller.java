package com.client01.conroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClient01Controller {

    @RequestMapping("test01")
    public String testClient01(){
        System.out.println("==========testClient01========");
        return "testClient01";
    }
}
