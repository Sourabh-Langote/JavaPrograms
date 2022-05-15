/**
 * 
 */
package com.gqt.fstraining.strings;
import java.util.Scanner;
/**
 * @author sourabh
 *
 */
public class ProgramString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.nextLine();
		String s2="";
		s1=s1.toLowerCase();
		
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(c=='a' || c=='A') {
				s2=s2+'1';
			}
			else if(c=='e' || c=='E') {
				s2=s2+'2';
			}
			else if(c=='i' || c=='I') {
				s2=s2+'3';
			}
			else if(c=='o' || c=='O') {
				s2=s2+'4';
			}
			else if(c=='u' || c=='U') {
				s2=s2+'5';
			}
			else {
				s2=s2+s1.charAt(i);
			
			}
		}
		System.out.println(s2);
	}
}