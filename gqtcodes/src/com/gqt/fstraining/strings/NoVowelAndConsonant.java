/**
 * 
 */
package com.gqt.fstraining.strings;
import java.util.Scanner;
/**
 * @author sourabh
 *
 */
public class NoVowelAndConsonant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		int vowel_count=0;
		int cons_count=0;
		
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
	    	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
	    		vowel_count++;
	    	}
	    	else {
	    		cons_count++;
	    	}
		}
		System.out.println("the number of vowels: "+vowel_count);
		System.out.println("the number of consonent: "+cons_count);
	}

}
