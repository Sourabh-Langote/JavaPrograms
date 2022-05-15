/**
 * 
 */
package com.gqt.fstraining.strings;
import java.util.Scanner;
/**
 * @author sourabh
 *
 */
public class SegregateChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.nextLine();
		String s2="";
		String s3="";
		
		
		for(int i=0;i<s1.length();i++) {
		if((s1.charAt(i)>=65) && (s1.charAt(i)<=90) || 
				(s1.charAt(i)>=97) && (s1.charAt(i)<=122) || 
				(s1.charAt(i)>=48) && (s1.charAt(i)<=57)) {
			s2=s2+s1.charAt(i);
		}
		else {
			s3=s3+s1.charAt(i);
		}
		}
		System.out.println(s2);
		System.out.println(s3);
	}

}
