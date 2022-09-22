/*create a class Shape with fields  int length,int breadth.Create another class Rectangle 
 * which inherits shape class and has field int area and calcualteArea method which will return area = length*breadth.create a main method 
 * and create object of sub class.Assign values to Shape class fields and Calculate the area. */
package Inheritance;

public class RectMain {
public static void main(String args[]) {
	Rectangle r=new Rectangle();
	r.length=9;
	r.breadth=4;
	r.calculateArea();
	
}
}
