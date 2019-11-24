package com.tx.dreamer.service.upms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author houxi
 * @date 2019/09/16
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.tx.dreamer.service.upms.mapper")
public class DreamServiceUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(DreamServiceUserApplication.class, args);
    }
}
