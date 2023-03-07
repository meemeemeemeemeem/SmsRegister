package com.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class SmsRegisterApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmsRegisterApplication.class, args);
    }

}
