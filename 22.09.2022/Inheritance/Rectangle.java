package Inheritance;

public class Rectangle extends Shape {
int area;
public void calculateArea() {
	area=length*breadth;
	System.out.print("Area of Rectangle is= "+area);
}
/*public void length() {
System.out.println("Enter length of rectangle="+length)	;
}
public void breadth() {
	System.out.println("Enter breadth of rectangle="+breadth)	;
	
}*/
}
