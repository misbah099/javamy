package oopjava.java;

public class Result extends Student implements Exam {
	int per;
	public Result(String name, int roll, int marks1, int marks2) {
	super(name, roll, marks1, marks2);
	}
	public void percentCall() {
	per=(marks1+marks2)/2; 
	System.out.println("Percentage :"+per+"%");
	}
	public String display() {
	return "Result [percentage=" + per + ", name=" + name + ", roll=" + roll + ", marks1="+ 
	marks1 + ", marks2=" + marks2+ "]";
	}
	}


