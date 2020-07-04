package com.svs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Springbootswagger2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootswagger2Application.class, args);
    }

    @Bean
    Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/api/*")).build();
    }

}
