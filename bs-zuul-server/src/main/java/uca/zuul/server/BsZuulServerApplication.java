package uca.zuul.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@RefreshScope
@EnableEurekaClient
public class BsZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BsZuulServerApplication.class, args);
    }
}
