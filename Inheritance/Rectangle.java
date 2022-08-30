package oopjava.java;

public class Rectangle {
int length;
int breadth;
Rectangle(int l,int b){
	this.length=l;
	this.breadth=b;
}
void area() {
	double area=this.length*this.breadth;
	System.out.println("area of rectangle="+area);
}
void perimeter() {
	double peri=2*(this.length+this.breadth);
	System.out.println("perimeter of rectangle="+peri);

}
}

