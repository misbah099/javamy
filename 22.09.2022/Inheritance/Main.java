package Inheritance;

public class Main {
	public static void main(String args[]){
		//creating an object of sub class
		Dog d=new Dog();
		//access field of Super class
		d.name="labrador";
		d.display();
		//call method of super class using object of sub class
		d.eat();
}
}