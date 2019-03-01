package uca.discovery.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@RefreshScope
@EnableEurekaServer
public class BsEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BsEurekaServerApplication.class, args);
    }
}
