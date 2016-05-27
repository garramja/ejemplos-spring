package com.demo.config;

import com.demo.service.AlgoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by javier.garcia on 27/05/2016.
 */
//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.demo","hello"})
@EnableCaching
public class Application {

    private static Logger LOG = LoggerFactory.getLogger(Application.class);

    @Component
    static class Runner implements CommandLineRunner {

        @Autowired
        private AlgoService algoService;

        @Override
        public void run(String... args) throws Exception {
            LOG.info("####################");
            LOG.info("Solicitudes a un servicio normal");
            LOG.info(algoService.getAlgoNoCacheNoDelay("#aaa").toString());
            LOG.info(algoService.getAlgoNoCacheNoDelay("#aaa").toString());

            LOG.info("Solicitudes a un servicio con delay");
            LOG.info(algoService.getAlgoNoCacheDelay("#aaa").toString());
            LOG.info(algoService.getAlgoNoCacheDelay("#aaa").toString());

            LOG.info("Solicitudes a un servicio normal con cache");
            LOG.info(algoService.getAlgoCacheNoDelay("#aaa").toString());
            LOG.info(algoService.getAlgoCacheNoDelay("#aaa").toString());

            LOG.info("Solicitudes a un servicio con cache y delay");
            LOG.info(algoService.getAlgoCacheDelay("#aaa").toString());
            LOG.info(algoService.getAlgoCacheDelay("#aaa").toString());
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
