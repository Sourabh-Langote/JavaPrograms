/**
 * 
 */
package gqtcodes;

/**
 * @author sourabh
 *
 */
class Calculator3{
	/**
	 * @param args
	 * description:the add() is not having any input and is not returning any value 
	 * return type:void
	 */
	int add(int a,int b)	//input-output
	{
		int c=a+b;
		return c;
	}
}
public class InputOutput {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		/**
		 * @param args
		 * description:this is the main method which creates the object of the Calculator class
		 */
		Calculator3 c1=new Calculator3();
		int res=c1.add(20,50); //parameter passed, return value received

	}

}
