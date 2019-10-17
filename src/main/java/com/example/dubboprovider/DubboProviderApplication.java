package com.example.dubboprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboProviderApplication {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(DubboProviderApplication.class, args);
        System.in.read();
    }

}
