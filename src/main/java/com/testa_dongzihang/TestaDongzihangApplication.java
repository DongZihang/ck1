package com.testa_dongzihang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.testa_dongzihang.mapper")
public class TestaDongzihangApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestaDongzihangApplication.class, args);
    }

}
