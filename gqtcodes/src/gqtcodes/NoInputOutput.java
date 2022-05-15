/**
 * 
 */
package gqtcodes;

/**
 * @author sourabh
 *
 */
class Calculator1{
	/**
	 * @param args
	 * description:the add() is not having any input and is not returning any value 
	 * return type:void
	 */
	int add()	//no input-output
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
}
public class NoInputOutput {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		/**
		 * @param args
		 * description:this is the main method which creates the object of the Calculator class
		 */
		Calculator1 c1=new Calculator1();
		int res=c1.add(); //parameter passed, return value received

	}

}
