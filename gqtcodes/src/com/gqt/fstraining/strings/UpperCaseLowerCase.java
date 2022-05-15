/**
 * 
 */
package com.gqt.fstraining.strings;
import java.util.Scanner;
/**
 * @author sourabh
 *
 */
public class UpperCaseLowerCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.nextLine();
		char [] chr=s1.toCharArray();
		
		for(int i=0;i<chr.length;i++) {
			if(chr[i]>=65 && chr[i]<=90) {
				chr[i]=(char)(chr[i]+32);
			}
			else if(chr[i]>=97 && chr[i]<=122) {
				chr[i]=(char)(chr[i]-32);
		}
	}
		for(int i=0;i<chr.length;i++) {
			System.out.print(chr[i]);
		}
  }
}