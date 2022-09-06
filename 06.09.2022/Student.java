package oopjava.java;

public class Student {
	protected String name; 
	protected int roll; 
	protected int marks1; 
	protected int marks2;
	public Student(String name, int roll, int marks1, int marks2) {
	super();
	this.name = name; 
	this.roll = roll; 
	this.marks1 = marks1; 
	this.marks2 = marks2;
	}
	public String show() {
		return "Student [name=" + name + ", roll=" + roll + ", marks1=" + marks1 + ", marks2=" +marks2 + "]";
				}
	}




