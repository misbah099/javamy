package oopjava.java;

public class Ford extends Car {
 int year;
 int manufactururDiscount;
 Ford(int speed,double regularprice,String colour,int year,int manufacturerDiscount){
	 super(speed, regularprice, colour);
	 this.year=year;
	 this.manufactururDiscount=manufacturerDiscount;
 }
double getSaleprice() {
	return super.getSaleprice()-this.manufactururDiscount;
}
}
