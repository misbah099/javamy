package oopjava.java;

public class Area {
	int l,b;
	Area(int length,int breadth)
	{
		l=length;
		b=breadth;
	}
	int setDim()
	{
		int result=l*b;
		return result;
	}
	 void getArea()
	{
		System.out.println("Area of rectangle="+setDim());
		
	}

}
