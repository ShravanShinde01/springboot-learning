package com.shravan.Junit_learning;

import com.shravan.Junit_learning.dog.Barks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitLearningApplicationTests {

	@Test
	void testDivide() {

		JunitLearningApplication app = new JunitLearningApplication();

		int result = app.divide(10, 2);
		int expected = 5;

		assertEquals(expected, result);
	}

	@Test
	void testBark() {
		Barks dog = new Barks();

		String result = dog.bark();

		assertEquals("dog is barking", result);
	}

	@Test
    void test(){
		String str = "Shravan";
		assertTrue(str.length()>5,"Lala tu to fail ho gya");
	}
}