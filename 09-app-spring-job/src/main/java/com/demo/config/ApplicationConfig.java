package com.demo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by javier.garcia on 26/05/2016.
 *
 * Para hacer la prueba sin tener que desplegar en un servidor, se puede
 * ejecutar mvn spring-boot:run
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(value = "com.demo")
//Las tres anotaciones anteriores se pueden sustituir por @SpringBootApplication
@PropertySource({"classpath:job.properties","classpath:fecha.properties"})
@EnableScheduling
public class ApplicationConfig {

    public static void main (String[] args) {
        SpringApplication.run(ApplicationConfig.class);
    }
}
