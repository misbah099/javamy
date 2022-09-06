/*Consider a Library Management System, where a user wants to find a book. If the
book is present in Library (Hint: Use predefined array), then it will print the book.
Otherwise it will throw an exception “BookNotFoundException”.  */
package oopjava.java;

import java.util.Scanner;

public class Library {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in); 
	int books[]={200,201,202,203,204};
	System.out.println("Enter the book no.:"); 
	int book=sc.nextInt();
	int flag=0;
	for(int i=0;i<books.length;i++)
	{
		if(books[i]==book)
			flag=1;
	}
	try
	{
	
	if(flag==0)
	throw new BooknotfoundException();
	else
	System.out.print("Book found");
	}
	catch(BooknotfoundException e)
	{
	System.out.print(e);
	}
	}
}
