package Assignment2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllTestCases {
	
	Calculator calc = new Calculator();

	@Test
	void testcase1() {
		assertEquals(18, calc.add(8, 10));
	}
	
	@Test
	void testcase2() {
		assertEquals(Double.MAX_VALUE, calc.add(10, Double.POSITIVE_INFINITY));
	}
	
	@Test
	void testcase3() {
		assertEquals(0, calc.naturallog(1));
	}
	
	@Test
	void testcase4() {
		assertEquals(-3, calc.divide(-21,7));
	}
	
	@Test
	void testcase5() {
		assertEquals(Double.POSITIVE_INFINITY, calc.divide(1, 0));
	}
	
	@Test
	void testcase6() {
		assertEquals(11, calc.subtract(11, 0));
	}
	
	@Test
	void testcase7() {
		assertEquals(0, calc.multiply(11, 0));
	}
	
	@Test
	void testcase8() {
		assertEquals(9, calc.power(3,2));
	}
	
	@Test
	void testcase9() {
		assertEquals(5, calc.squareRoot(25));
	}
	
	@Test
	void testcase10() {
		assertEquals(1, calc.cos(360));
	}
	
	@Test
	void test11() {
		assertEquals(1, calc.sin(90));
	}
	
	@Test
	void test12() {
		assertEquals(2, calc.log(100,10));
	}
}
