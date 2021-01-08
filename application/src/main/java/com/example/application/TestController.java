package com.example.application;

import com.example.common_library.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class TestController {
//    @Autowired
//    TestService testService;
    @GetMapping("test")
    public String test(){
        return "testService.getString()";
    }
}
