package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.lti.demo.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		int actualResult = cal.add(30, 40);
		// sysout is worng, we should never write sysout in test cases
		// instead we use assertion in our test cases
		int expectedResult = 70;
		assertEquals(expectedResult,actualResult);
	}

	@Test
	public void testSub() {
		Calculator cal = new Calculator();
		int actualResult = cal.sub(30, 40);
		// sysout is wrong, we should never write sysout in test cases
		// instead we use assertion in our test cases
		int expectedResult = -10;
		assertEquals(expectedResult,actualResult);
	}

}
