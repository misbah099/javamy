/*Write a program to accept value of apple sales for each day of the week (using array of
type float) and then, calculate the average sale of the week */

package pack.java;

import java.util.Scanner;

public class Apple {public static void main(String args[])
{
float app[]= new float[7];
app[0]=(float) 3.3;
app[1]=(float) 8.3;
app[2]=(float) 7.3;
app[3]=(float) 3.3;
app[4]=(float) 2.3;
app[5]=(float) 10.3;
app[6]=(float) 12.3;

float avg=0;
Scanner sc=new Scanner(System.in);
try
{
	for(int i=0;i<7;i++)
	{
	System.out.println(app[i]);
	}

	for(int i=0;i<7;i++)
	{
		avg+=app[i];
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

