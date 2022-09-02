/*Write a program to accept value of apple sales for each day of the week (using array of
type float) and then, calculate the average sale of the week */

package pack.java;

import java.util.Scanner;

public class Apple {public static void main(String args[])
{
float apple[]= new float[7];
apple[0]=(float) 3.3;
apple[1]=(float) 8.3;
apple[2]=(float) 7.3;
apple[3]=(float) 3.3;
apple[4]=(float) 2.3;
apple[5]=(float) 10.3;
apple[6]=(float) 12.3;

float avg=0;
Scanner sc=new Scanner(System.in);
try
{
	for(int i=0;i<7;i++)
	{
	System.out.println(apple[i]);
	}

	for(int i=0;i<7;i++)
	{
		avg+=apple[i];
	}
	
	avg=avg/7;
	System.out.println("Average sales of week : "+avg);
}

catch(Exception e)
{
	System.out.println("I/O Error");
}
}
}

