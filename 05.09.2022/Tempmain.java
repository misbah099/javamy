/*  Create two user-defined exceptions named “TooHot” and “TooCold” to check the temperature (in Celsius) given by the user passed  is too hot or too cold.

If temperature > 35, throw exception “TooHot”.

 If temperature <5, throw exception “TooCold”.

Otherwise, print “Normal” and convert it to Farenheit.   */

package oopjava.java;

public class Tempmain {
	static float f=0;
static void calc(float temp)throws ToohotException,ToocoldException{
	if(temp>35) {
		throw new ToohotException("Toohot temperature");
	}
	else if(temp<5) {
	throw new ToocoldException("Toocold Temperature");
	}
	else {
		System.out.println("Temperature is normal");
		 f=(temp*9/5)*32;
			System.out.println("Temperature in Fahrenheit= "+f+"Fahrenheit");

	}
	
	}

public static void main(String args[]) {
	try {
		Tempmain.calc(15);
	}
	catch (ToohotException e) {
		System.out.println(e.getMessage());
	}
	catch (ToocoldException e) {
		System.out.println(e.getMessage());
}
}
}
