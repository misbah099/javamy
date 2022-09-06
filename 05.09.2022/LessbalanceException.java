package oopjava.java;

public class LessbalanceException extends Exception {
	LessbalanceException(int i){
		System.out.println("withdrawing "+i+" invalid");
	}
}
