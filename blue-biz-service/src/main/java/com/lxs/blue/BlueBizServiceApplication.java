package com.lxs.blue;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@EnableDiscoveryClient
//@EnableFeignClients // 要使用Feign，需要加上此注解，且Feign已默认整合了Hystrix
//@EnableHystrix // 启用Hystrix，需要加上此注解
public class BlueBizServiceApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(BlueBizServiceApplication.class, args);
    }
}
