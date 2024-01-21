package com.mariocosta;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableFeignClients(
        basePackages = "com.mariocosta.clients"
)
public class KakfaApplication {
    public static void main(String[] args) {
        SpringApplication.run(KakfaApplication.class, args);
    }
}