/* write a java program to input an array and use  a method which is having the array and the searched element in argument.
 * Search the element using binary search and if element is found return true otherwise return false. */
package pack.java;

import java.util.Scanner;

public class Binary_array {
		public static boolean ser(int a[],int key,int n) {
			int low=0,high,mid;
			high=n-1;
			mid=(low+high)/2;
			for(int i=0;i<=high;i++) {
				if(key==a[i]) {
					return true;
				}
				else if(key>mid) {
					low=mid+1;
					mid=(low+high)/2;
				}
			}
			return false;
		}
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size=");
			int n=sc.nextInt();
			int arr[]=new int[20];
			System.out.println("Enter elements in ascending order only=");
     for(int i=0;i<n;i++) {
    	 arr[i]=sc.nextInt();
     }
		System.out.println(ser(arr,6,n));

		}
}

