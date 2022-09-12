/* WAP to input an array in random order and then sort it using
 *  bubble sort and then search for a given element from that sorted array  */
package pack.java;

import java.util.Scanner;

public class BubbleSortandFind {
	public static void main(String args[]) {
		int arr[]= {1,3,2,5,4};
		int temp;
		System.out.println("Array is =");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");	
		}
		System.out.println("\nAfter sorting Array is =");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");	
		}

System.out.println("Enter the Element you want to find in array");
Scanner sc=new Scanner(System.in);
int find=sc.nextInt();
for(int i=0;i<arr.length;i++) {
	if(find==arr[i]) {
		System.out.println("Element found ="+arr[i]);
		break;
	}
	else {
		System.out.println("Element not found");

	}
}
}
}