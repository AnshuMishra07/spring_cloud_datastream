package com.cloud.data.stream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.config.ContextFunctionCatalogAutoConfiguration;
@SpringBootApplication(exclude=ContextFunctionCatalogAutoConfiguration.class)
public class EventStreamApplication {
    public static void main(String[] args) {
    	SpringApplication.run(EventStreamApplication.class);
    }
}