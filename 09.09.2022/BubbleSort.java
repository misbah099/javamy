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
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
		System.out.print(arr[i]+" ");	
	}
}
}