package com.sb.hellowolrd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class WelcomeControllerTest {

    public static Logger logger = LoggerFactory.getLogger(WelcomeControllerTest.class);
    @Test
    public void contextLoader(){
        logger.info("********* WelcomeControllerTest - contextLoader - test case executed *********");
        Assertions.assertEquals(true, true);
    }

}
