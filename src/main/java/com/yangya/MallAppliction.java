package com.yangya;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.yangya.dao")
@SpringBootApplication
public class MallAppliction {

    public static void main(String[] args) {
        SpringApplication.run(MallAppliction.class,args);
    }
}
