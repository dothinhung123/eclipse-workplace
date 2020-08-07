package com.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.calculate(1, 1);
		assertEquals(expected,actual,"The add method should add tow numbers");
		
	}
	@Test
	void testComputeCircleRadius() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(314.1592653589793,mathUtils.computeCricleRadius(10),"Should rean the right circle area");
	}

}
