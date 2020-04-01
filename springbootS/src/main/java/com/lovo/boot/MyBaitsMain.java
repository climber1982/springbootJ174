package com.lovo.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//自定义DAO交给mybaits
@MapperScan("com.lovo.boot.dao")
@SpringBootApplication
public class MyBaitsMain {
    public static void main(String[] args) {
        SpringApplication.run(MyBaitsMain.class);
    }
}
