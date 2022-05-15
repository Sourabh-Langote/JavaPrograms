/**
 * 
 */
package com.gqt.fstraining.strings;
import java.util.Scanner;
/**
 * @author sourabh
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		if(s1.equals(s2)==true) {
		System.out.println("string is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}