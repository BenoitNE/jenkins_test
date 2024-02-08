package com.gk.testjenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OperationTest {

	@Test
	void contextLoads() {
	}
	
	@Test
	void reverse () {
		assertEquals(-3, Operation.reverse(3));
	}
	
	@Test
	void squared () {
		assertEquals(9, Operation.squared(3));
	}

}
