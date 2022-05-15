/**
 * 
 */
package gqtcodes;

/**
 * @author sourabh
 *
 */
class Car{
	String name;
	String color;
	int gear;
	int doors;
	
	/**
	 * description:this is the method to indicate the start engine of the car
	 * return type:void
	 */
	
	void startEngine() {
		System.out.println("Car engine is start");
	}
	
	/**
	 * description:this is the method to indicate the stop engine of the car
	 * return type:void
	 */
	void stopEngine() {
		System.out.println("car engine is stop");
	}
	
	/**
	 * description:this is the method to indicate the gear of the car
	 * return type:void
	 */
	void gear() {
		System.out.println("car gear is changed");
	}
}
public class launch2 {

	/**
	 * @param args
	 * description:this is the main method which creates the object of the class
	 * return type:void
	 */
	public static void main(String[] args) {
		Car c=new Car();  //object creation
		c.name="Toyota";
		c.color="white";
		c.gear=5;
		c.doors=5;
		
		System.out.println("the properties of car are as follows");
		System.out.println(c.name);    //Toyota
		System.out.println(c.color);   //white
		System.out.println(c.gear);    //5
		System.out.println(c.doors);   //5
		
		System.out.println("the behaviour of the car are as follows");
		c.startEngine();
		c.stopEngine();
		c.gear(); 
		System.out.println("----------------------------------------------------");
		
		Car c1=new Car();  //object creation
		c1.name="Maruti";
		c1.color="black";
		c1.gear=5;
		c1.doors=5;
		
		System.out.println("the properties of car are as follows");
		System.out.println(c1.name);    //Maruti
		System.out.println(c1.color);   //black
		System.out.println(c1.gear);    //5
		System.out.println(c1.doors);   //5
		
		System.out.println("the behaviour of the dog are as follows");
		c1.startEngine();
		c1.stopEngine();
		c1.gear(); 
	}

}
