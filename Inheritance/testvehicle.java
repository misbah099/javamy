/*Write a program to create a class named Vehicle having protected instance variables
regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a
vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having
individual private instance variables routeNumber in Bus and manufacturerName in Car
and both of them having showData ( ) method showing all details of Bus and Car
respectively with content of the super class’s showData ( ) method.*/

package oopjava.java;

import java.util.*;

public class testvehicle {
public static void main(String args[]) {
	String regno,colour,owner,manufacturer;
	int  speed,route;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter bus regno=");
	regno=sc.nextLine();
	System.out.println("enter bus colour=");
	colour=sc.nextLine();
	System.out.println("enter bus Ownername=");
	owner=sc.nextLine();
	System.out.println("enter bus speed=");
	speed=sc.nextInt();
	System.out.println("enter bus RouteNumber=");
	route=sc.nextInt();
	Bus b=new Bus(regno, colour, owner, speed,route);
	b.showData();
	System.out.println("enter car regno=");
	regno=sc.nextLine();
	System.out.println("enter car colour=");
	colour=sc.nextLine();
	System.out.println("enter car Ownername=");
	owner=sc.nextLine();
	System.out.println("enter car speed=");
	speed=sc.nextInt();
	System.out.println("enter car manufacturerName=");
	manufacturer=sc.nextLine();
	Car2 c=new Car2(regno, colour, owner, speed,manufacturer);
	c.showData();
}
}
