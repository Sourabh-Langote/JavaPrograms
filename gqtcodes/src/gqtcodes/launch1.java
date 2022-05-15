/**
 * 
 */
package gqtcodes;

/**
 * @author sourabh
 *
 */
class Dog{
	String name;
	String color;
	int cost;
	String breed;
	/**
	 * description:this is the method to indicate the run behaviour of the dog
	 * return type:void
	 */
	void run() {
		System.out.println("Dog is running");
	}
	
	/**
	 * description:this is the method to indicate the walk behaviour of the dog
	 * return type:void
	 */
	void walk() {
		System.out.println("Dog is walking");
	}
	/**
	 * description:this is the method to indicate the eat behaviour of the dog
	 * return type:void
	 */
	void eat() {
		System.out.println("Dog is eating");
	}
}
public class launch1 {

	/**
	 * @param args
	 * description:this is the main method which creates the objects of dog class
	 * return type:void
	 */
	
	public static void main(String[] args) {
		Dog d=new Dog();
		d.name="Tommy";
		d.color="white";
		d.cost=5000;
		d.breed="GR";
		
		System.out.println("The properties of Dog are as follows");
		System.out.println(d.name);
		System.out.println(d.color);
		System.out.println(d.cost);
		System.out.println(d.breed);
		System.out.println("The behaviours of the dog are as follows:");
		d.run();
		d.walk();
		d.eat();
		
		System.out.println("-------------------------------------------------");
		
		Dog d1=new Dog();
		d1.name="Jerry";
		d1.color="Brown";
		d1.cost=6000;
		d1.breed="GR";
		
		System.out.println("The properties of Dog are as follows");
		System.out.println(d1.name);
		System.out.println(d1.color);
		System.out.println(d1.cost);
		System.out.println(d1.breed);
		System.out.println("The behaviours of the dog are as follows:");
		d1.run();
		d1.walk();
		d1.eat();

	}

}
