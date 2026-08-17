package com.example.grafanaprometheus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GrafanaPrometheusApplication {

    final static Logger logger = LoggerFactory.getLogger(GrafanaPrometheusApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(GrafanaPrometheusApplication.class, args);
    }

    @GetMapping("/message")
    public String getMessage(){
    logger.warn("Just Checking");
    return "Working....!!";
    }

}
