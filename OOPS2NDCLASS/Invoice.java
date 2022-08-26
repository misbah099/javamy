package oopjava.java;

public class Invoice {
String partNumber;
String partDescription;
int quantityofpurchased;
double priceperitem;
Invoice(String partNumber,String partDescription,int quantityofpurchased,double priceperitem){
this.partNumber=partNumber;
this.partDescription=partDescription;
this.quantityofpurchased=quantityofpurchased;
this.priceperitem=priceperitem;
if(this.quantityofpurchased<0)
{
	this.quantityofpurchased=0;
}
else if(this.priceperitem<0)
{
	this.priceperitem=0;
}

}
double getInvoice()
{
	return this.priceperitem*this.quantityofpurchased;
}
}
