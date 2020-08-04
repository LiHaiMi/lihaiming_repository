package cn.jiyu.service.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JiyunServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiyunServiceProviderApplication.class, args);
    }

}
