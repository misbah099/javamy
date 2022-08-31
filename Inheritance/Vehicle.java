package oopjava.java;

public class Vehicle {
	protected String regnNumber,colour,ownerName;
	protected int speed;
	Vehicle(String regno,String c,String owner,int sp ){
		this.regnNumber=regno;
		this.colour=c;
		this.ownerName=owner;
		this.speed=sp;
	}
	public void showData() {
		System.out.println("Variable class");
	}
}
