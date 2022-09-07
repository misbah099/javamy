package com.JUnit_Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Add_Test {

	@Test
	void test_add() {
		Addition a=new Addition();
		int actual=a.sum(5, 10);
		int expected=15;
		assertEquals(expected,actual);
	}

}
