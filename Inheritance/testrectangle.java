/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively.
 *  Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle.
 *   Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.
 */
package oopjava.java;

public class testrectangle {
	public static void main(String args[]) {
		Rectangle r1=new Rectangle(2,3);
		Square s1=new Square(2);
		r1.area();
		r1.perimeter();
		s1.area();
		s1.perimeter();
	}

}
