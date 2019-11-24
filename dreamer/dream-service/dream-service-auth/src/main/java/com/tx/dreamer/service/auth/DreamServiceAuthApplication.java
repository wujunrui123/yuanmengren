package com.tx.dreamer.service.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;


/**
 * @author houxi
 * @date 2019/09/16
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAuthorizationServer
@MapperScan("com.tx.dreamer.service.auth.mapper.*")
public class DreamServiceAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(DreamServiceAuthApplication.class, args);
    }

}
