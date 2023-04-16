package com.chen.medapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class MedApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedApiApplication.class, args);
    }

}
