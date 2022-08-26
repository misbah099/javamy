package oopjava.java;

public class Adddistance {
int feet,r;
void convert(int a,int b,int c ,int d)
{
	int count=0;
	r=a+b;
	while(r>12)
	{
	r=r-12;	
		count++;
	}

   feet=c+d+count;
}
    int feet()
{
	return feet;
}
int inches()
{
	return r;
}
}