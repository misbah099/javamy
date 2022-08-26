

/*WAP to print the area and perimeter of a triangle having sides of 3,4 and 5 units
by creating a class named 'triangle'without any parameter in its constructor*/

package oopjava.java;
public class trianglearea {
public static void main(String args[])
{
	triangle t=new triangle();
	int peri=(t.s1+t.s2+t.s3);
	System.out.println("perimeter of the triangle is="+peri);
	float sp=(peri/2);
	float ar=((sp*(sp-t.s1)*(sp-t.s2)*(sp-t.s3)));
	float area=(float)Math.sqrt(ar);
	System.out.println("Area of the triangle is="+area);

}
}
