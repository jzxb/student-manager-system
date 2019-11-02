package com.suixingpay.student;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lhx
 * @date 2019/11/1 - 13:43
 */
@SpringBootApplication
@MapperScan(value = "com.suixingpay.student.mapper")
public class
StudentManagerSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentManagerSystemApplication.class, args);
    }
}
