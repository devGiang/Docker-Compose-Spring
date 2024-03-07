package com.example.apiping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class ApIpingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApIpingApplication.class, args);
    }

}
