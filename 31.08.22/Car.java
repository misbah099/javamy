package oopjava.java;

public class Car {
int speed;
double regularprice;
String colour;
Car(int speed,double regularprice,String colour){
	this.speed=speed;
	this.regularprice=regularprice;
	this.colour=colour;
}
double getSaleprice() {
	return regularprice;
}
}
