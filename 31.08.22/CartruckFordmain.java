/*Create a super class called Car. The Car class has the following fields and methods.
◦intspeed;
◦doubleregularPrice;
◦Stringcolor;
◦doublegetSalePrice();

Create a sub class of Car class and name it as Truck. The Truck class has the following fields and methods.
◦intweight;
◦doublegetSalePrice();//Ifweight>2000,10%discount.Otherwise,20%discount.

Create a subclass of Car class and name it as Ford. The Ford class has the following fields and methods
◦intyear;
◦intmanufacturerDiscount;
◦doublegetSalePrice();//FromthesalepricecomputedfromCarclass,subtractthemanufacturerDiscount.  */

package oopjava.java;

public class CartruckFordmain {
public static void main(String args[]) {
	Truck t=new Truck(100, 300, "red");
	Car c=new Car(300, 100, "blue");
	Ford f=new Ford(200, 300000, "Blue", 2012, 10000);
	System.out.println("Truck ="+t.getSaleprice());

	System.out.println("Ford= ="+f.getSaleprice());

	System.out.println("Car="+c.getSaleprice());

	}
}
