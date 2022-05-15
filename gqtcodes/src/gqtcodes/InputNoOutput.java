/**
 * 
 */
package gqtcodes;

/**
 * @author sourabh
 *
 */
class Calculator2{
	/**
	 * @param args
	 * description:the add() is not having any input and is not returning any value 
	 * return type:void
	 */
	void add(int a,int b)	//no input-no output
	{
		int c=a+b;
		System.out.println(c);
	}
}
public class InputNoOutput {

	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		/**
		 * @param args
		 * description:this is the main method which creates the object of the Calculator class
		 */
		Calculator2 c1=new Calculator2();
		c1.add(20,70);

	}

}
