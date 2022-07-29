package com.mudy.testtca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestTcaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestTcaApplication.class, args);
    }

    void test(){
        int i = 1/0;
        System.out.println("i = " + i);
    }

    void test2(){
        int i = 1/0;
        System.out.println("i = " + i);
    }

}
