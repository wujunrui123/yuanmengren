package com.tx.dreamer.client.backstage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DreamClientBackstageApplication {

    public static void main(String[] args) {
        SpringApplication.run(DreamClientBackstageApplication.class, args);
    }

}
