/**
 * 
 */

/**
 * @author sourabh
 *
 */
class Plane{ 
	void takeoff(){
	System.out.println("plane takeoffs");
}
	void fly() {
		System.out.println("plane flys");
	}
	void land() {
		System.out.println("plane lands");
	}

}
class CargoPlane extends Plane{
	@override
	void takeoff() {
		System.out.println("plane takeoffs");
	}
	void fly() {
	
	}
}
public class SimpleInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
