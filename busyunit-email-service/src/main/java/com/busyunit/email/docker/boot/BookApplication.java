package com.busyunit.email.docker.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * {@code BookApplication} represents the entry point for book controller
 * spring boot application.
 * <p/>
 *
 * @author Indra Basak
 * @since 2/23/17
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {
        "com.busyunit.email.docker.config",
        "com.busyunit.email.docker.controller",
        "com.busyunit.email.docker.error",
        "com.busyunit.email.docker.model",
        "com.busyunit.email.docker.service",
        "com.busyunit.email.docker.util"})
public class BookApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }
}
