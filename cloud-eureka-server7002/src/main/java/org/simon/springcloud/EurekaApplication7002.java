package org.simon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: simon
 * @DATE： 2020-03-20
 * @Vesion 1.0
 * @Description:
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication7002.class,args);
    }
}
