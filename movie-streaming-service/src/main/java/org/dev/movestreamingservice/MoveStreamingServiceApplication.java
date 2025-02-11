package org.dev.movestreamingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MoveStreamingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoveStreamingServiceApplication.class, args);
    }

}
