package com.gary.devopsk8sdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevopsK8sDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevopsK8sDemoApplication.class, args);
    }

    @GetMapping("/say")
    public String hello(){
        return "hello k8s devops-v2";
    }

}
