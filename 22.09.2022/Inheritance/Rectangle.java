package Inheritance;

public class Rectangle extends Shape {
int area;
public void calculateArea() {
	area=length*breadth;
	System.out.print("Area of Rectangle is= "+area);
}
}
