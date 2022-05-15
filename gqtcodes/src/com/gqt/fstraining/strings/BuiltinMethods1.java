/**
 * 
 */
package com.gqt.fstraining.strings;

import java.util.Iterator;

/**
 * @author sourabh
 *
 */
public class BuiltinMethods1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1="RajaRamMohanRoy";
		System.out.println(s1.concat("India"));
		System.out.println(s1.isBlank());
		System.out.println(s1.isEmpty());
		System.out.println(s1.lastIndexOf('R'));
		System.out.println(s1.lastIndexOf('R','6'));
		System.out.println(s1.replace('a','o'));
		System.out.println(s1.strip());
		System.out.println(s1.trim());
		char[] c=s1.toCharArray();
		for(int i=0; i<c.length;i++)
		{
			System.out.print(c[i]+",");
		}
		System.out.println(s1.toString());
	}

}
