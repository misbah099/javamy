/*Add two distances in inch-feet by creating a class named 'Adddistance'*/
package oopjava.java;
import java.util.Scanner;

public class feetinches {
public static void main(String args[])
{
	int f1,i1,f2,i2;
	Scanner sc=new Scanner(System.in);
	Adddistance d=new Adddistance();
	System.out.println("Enter distance1 in feet");
	f1=sc.nextInt();
	System.out.println("Enter distance1 in inches");
	i1=sc.nextInt();
	System.out.println("Enter distance2 in feet");
	f2=sc.nextInt();
	System.out.println("Enter distance2 in inches");
	i2=sc.nextInt();
	d.convert(f1, i1, f2, i2);
	System.out.println("Distance in feet is"+d.feet());
	System.out.println("Distance in inches is"+d.inches());
}
}
