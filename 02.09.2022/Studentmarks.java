/*Write a program to print the roll number and 
 * average marks of 8 students in three subjects (each out of 100). The marks are entered by user.*/
package pack.java;

import java.util.Scanner;

public class Studentmarks {
	public static void main(String args[]) {
		
    int s1,s2,s3,avg=0;
    int roll=0;
    Scanner sc = new Scanner(System.in);
    for(int i=1; i<=8; i++){

    for(int j=1; j<=8; j++){
            System.out.print("\nEnter Your Roll Number: ");
            roll = sc.nextInt();

            System.out.print("Enter Your First Subject Mark: ");
            s1 = sc.nextInt();
            System.out.print("Enter Your Second Subject Mark: ");
            s2 = sc.nextInt();
            System.out.print("Enter Your Third Subject Mark: ");
            s3 = sc.nextInt();

             avg = (s1 + s2 + s3) / 3;

    
                System.out.printf("Roll no: "+roll+" Average marks= "+avg);
            
            
    }          
    }
	}
}
        



