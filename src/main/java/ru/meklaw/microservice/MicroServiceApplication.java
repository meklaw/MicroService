package ru.meklaw.microservice;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MicroServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(MicroServiceApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }

}
