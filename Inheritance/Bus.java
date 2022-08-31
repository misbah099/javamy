package oopjava.java;

public class Bus extends Vehicle {
	private int routeNumber;
	Bus(String regno,String c,String owner,int sp,int route){
		super(regno,c,owner,sp);
		routeNumber=route;
		}
	public void showData() {
		System.out.println("bus Reg no:"+this.regnNumber);
		System.out.println("bus Colour no:"+this.colour);
		System.out.println("bus Owner no:"+this.ownerName);
		System.out.println("bus Speed:"+this.speed);
		System.out.println("Bus route:"+routeNumber);

	}

}
