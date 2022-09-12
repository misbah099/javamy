/* WAP to sort an array using Bubble sort in java*/
package pack.java;

public class BubbleSort {
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
}
}