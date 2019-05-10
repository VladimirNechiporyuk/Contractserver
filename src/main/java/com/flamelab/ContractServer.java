package com.flamelab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ContractServer {
    public static void main(String[] args) {
        SpringApplication.run(ContractServer.class, args);
    }
}
