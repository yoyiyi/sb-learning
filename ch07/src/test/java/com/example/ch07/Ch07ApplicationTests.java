package com.example.ch07;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Ch07ApplicationTests {

	@Test
	public void contextLoads() {
		log.info("name: {}, password: {}", "111", "2222");

	}

}
