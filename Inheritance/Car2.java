package oopjava.java;

public class Car2 extends Vehicle {
	private String manufactureName;
	Car2(String regno,String c,String owner,int sp,String manu){
		super(regno,c,owner,sp);
		manufactureName=manu;
	}
	public void showData() {
		System.out.println("car Reg no:"+this.regnNumber);
		System.out.println("car Colour no:"+this.colour);
		System.out.println("car Owner no:"+this.ownerName);
		System.out.println("car Speed:"+this.speed);
		System.out.println("car manufacturer name:"+manufactureName);
	}
	

}
