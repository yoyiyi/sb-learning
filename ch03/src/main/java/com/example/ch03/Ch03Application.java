package com.example.ch03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ch03.dao") //扫描mapper文件
public class Ch03Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch03Application.class, args);
    }
}
