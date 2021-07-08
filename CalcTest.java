package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void addtest() {
		Calc test1=new Calc();
		int case1=test1.add(10, 20);
		assertEquals(30, case1);
		
		int case2=test1.add(-10, -20);
		assertEquals(-30, case2);
	}
	@Test
	void subtest() {
		Calc test2=new Calc();
		int case1=test2.sub(10, 5);
		assertEquals(5, case1);
		
		int case2=test2.sub(5, 10);
		assertEquals(-5, case2);
	}
	@Test
	void multest() {
		Calc test3=new Calc();
		int case1=test3.mul(5, 5);
		assertEquals(25, case1);
		
		int case2=test3.mul(5, -5);
		assertEquals(-25, case2);
	}
	@Test
	void divtest() {
		Calc test4=new Calc();
		int case1=test4.div(25, 5);
		assertEquals(5, case1);
		
		int case2=test4.div(625, 25);
		assertEquals(25, case2);
		
	}
	
	
}
