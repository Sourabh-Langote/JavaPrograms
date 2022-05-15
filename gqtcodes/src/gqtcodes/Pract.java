/**
 * 
 */
package gqtcodes;

public class Pract {
	static boolean sum(int num) {
		if(num%2==0) {
		return true;	
		}
	else { 
		return false;
	}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=10;
		int m=11;
		boolean t=sum(n);
		boolean a=sum(m);
		System.out.println(t +" "+m);
}
}