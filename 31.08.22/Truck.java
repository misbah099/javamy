package oopjava.java;

public class Truck extends Car {
	int weigth;

Truck(int speed, double regularprice, String colour) {
		super(speed, regularprice, colour);
		this.weigth=weigth;
	}
double getSaleprice() {
	if(this.weigth>2000) {
		return super.getSaleprice()*0.1;
	}
	else {
		return super.getSaleprice()*0.2;

	}
}	

}
