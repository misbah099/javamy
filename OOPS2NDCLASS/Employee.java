package oopjava.java;

public class Employee {
	int pan_no;
	String name;
	int income;
	double tax;

Employee(int pan,String name,int income){
	this.pan_no=pan;
	this.name=name;
	this.income=income;
}
double getTax() {

	if(income<=100000) {
		System.out.println("No tax payable");
	}
	else if(income<=150000) {
		tax=(income-150000)*0.1;
	}
	else if(income<=250000) {
		tax=5000+((income-250000)*0.2);
	}
	else {
		tax=25000+((income-250000)*0.3);
		
	}
	return tax;
}
}
