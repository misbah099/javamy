package pack.java;

import java.util.Scanner;

public class Matrix {
public static void main(String args[]) {
	String a[][]=new String[3][3];
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++)
		{
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			a[i][j]=str;
			
			
		}
	}
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.println("a["+i+"["+j+"]= "+a[i][j]);
		}
	}
}
}
