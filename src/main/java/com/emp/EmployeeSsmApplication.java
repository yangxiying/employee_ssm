package com.emp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.emp.dao")
public class EmployeeSsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeSsmApplication.class, args);
    }
}
