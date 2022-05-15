/**
 * 
 */
package gqtcodes;

/**
 * @author sourabh
 *
 */
class Calculator{
	/**
	 * @param args
	 * description:the add() is not having any input and is not returning any value 
	 * return type:void
	 */
	void add()	//no input-no output
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
}
public class NoInputNoUotput {

	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		/**
		 * @param args
		 * description:this is the main method which creates the object of the Calculator class
		 */
		Calculator c1=new Calculator();
		c1.add();

	}

}
