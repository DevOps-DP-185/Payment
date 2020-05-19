package com.softserve.paymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableSwagger2
@SpringBootApplication
public class KickScooterPaymentServiceApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(KickScooterPaymentServiceApplication.class);
    }    
    public static void main(String[] args) {
        SpringApplication.run(KickScooterPaymentServiceApplication.class, args);
    }
}



