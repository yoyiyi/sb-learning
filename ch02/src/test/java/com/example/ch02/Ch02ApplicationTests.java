package com.example.ch02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Ch02ApplicationTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(Ch02ApplicationTests.class);

    @Autowired
    private HomeProperties mHomeProperties;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getHomeProperties() {
        LOGGER.info("\n\n" + mHomeProperties.toString());
    }

}
