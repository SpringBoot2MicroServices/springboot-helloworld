package com.sb.hellowolrd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class WelcomeController {

    public static Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @PostConstruct
    public void init(){
        logger.info("WelcomeController started");
    }

    @GetMapping
    public String welcome(){
        logger.info("##############  Application executed - Inside WelcomeController - welcome API ##############");
        return "Welcome from spring boot Hello World program";
    }

}
