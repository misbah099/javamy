package com.JUnit_Testing;

public class Businesslogic {
		public double per(Student stu) {
			double per=0;
			int total=300;
			per=stu.getMarks1()+stu.getMarks2()+stu.getMarks3();
		double	percent=per*100/total;
			return percent;
		}
}
