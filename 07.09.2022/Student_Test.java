package com.JUnit_Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Student_Test {
	Student s=new Student();
	Businesslogic b=new Businesslogic();

	@Test
	void test() {
		s.setName("Rahul");
		s.setMarks1(40);
		s.setMarks2(60);
		s.setMarks3(70);
		double p=b.per(s);
		assertEquals(59.66666666666667,p);
	}

}
