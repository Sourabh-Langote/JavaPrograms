package Inheritance;
class Plane{
	void fly() {
		System.out.println("plane is flying");
	}
	void takeoff() {
		System.out.println("plane is takes off");
	}
	void land() {
		System.out.println("plane is landing");
	}
}
class Cargo extends Plane{
	void fly() {
		System.out.println("cargo plane is flying");
	}
	void takeoff() {
		System.out.println("cargo takes off");
	}
	void landing() {
		System.out.println("cargo is landing");	
	}
}
class Passenger extends Plane{
	void fly() {
		System.out.println("passenger plane is flying");
	}
	void takeoff() {
		System.out.println("passenger plane takes off");
	}
}
public class Inher1 {
	public static void main(String[] args) {
		System.out.println("plane details");
		Plane p=new Plane();
		p.fly();
		p.takeoff();
		p.land();
		
		System.out.println("---------------------------------------");
		
		System.out.println("details of cargo plane");
		Cargo c=new Cargo();
		c.fly();
		c.landing();
		c.takeoff();
		c.land();
		System.out.println("---------------------------------------");
		
		System.out.println("details of passenger plane");
		Passenger ps=new Passenger();
		ps.fly();
		ps.takeoff();
		ps.land();
	}
}