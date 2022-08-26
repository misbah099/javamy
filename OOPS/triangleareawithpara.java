
/*WAP to print the area and perimeter of a triangle having sides of 3,4 and 5 units
by creating a class named 'triangle'with constructor having the three sides as parameter*/

package oopjava.java;

public class triangleareawithpara {
public static void main(String args[])
{
	triangle1 t=new triangle1(3,4,5);
	int peri=(t.s1+t.s2+t.s3);
	System.out.println("Peri meter of the triangle="+peri);
	float sp=(peri/2);
	float ar=((sp*(sp-t.s1)*(sp-t.s2)*(sp-t.s3)));
	float area=(float)Math.sqrt(ar);
	System.out.println("Area of the triangle is="+area);

		
}
}
