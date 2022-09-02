/*Write a java program to input 5 elements of an array and search for a number
 *  whether it is present in an array or not. If present print its position in the array.*/
package pack.java;

import java.util.Scanner;

public class Findarray {
public static void main(String args[]) {
    int n, find = 0, i = 0;
    Scanner s = new Scanner(System.in);
    
    int a[] = new int[5];
    System.out.println("Enter all the elements:");
    for(i = 0; i < 5; i++)
    {
        a[i] = s.nextInt();
    }
    System.out.print("Enter the element you want to find:");
   int search = s.nextInt();
    for(i = 0; i < 5; i++)
    {
        if(a[i] == search)
        {
            find = 1;
            break;
        }
        else
        {
            find = 0;
        }
    }
    if(find == 1)
    {
        System.out.println("Element found at position:"+(i + 1));
    }
    else
    {
        System.out.println("Element not found");
    }
}
}