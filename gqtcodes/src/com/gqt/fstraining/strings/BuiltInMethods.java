/**
 * 
 */
package com.gqt.fstraining.strings;

/**
 * @author sourabh
 *
 */
public class BuiltInMethods {
	public static void main(String[] args) {
		String s1="RajaRamMohanRoy";
		System.out.println("the main string is: "+s1);
		String res1=s1.toUpperCase();
		System.out.println("toUpperCase Result: "+res1);
		String res2=s1.toLowerCase();
		System.out.println("toLowerCase Result: "+res2);
		boolean res3=s1.startsWith("Raja");
		System.out.println("startsWith Result: "+res3);
		boolean res4=s1.startsWith("Roja");
		System.out.println("startsWith Result: "+res4);
		boolean res5=s1.endsWith("Roy");
		System.out.println("endsWith Result: "+res5);
		boolean res6=s1.endsWith("Boy");
		System.out.println("endsWith Result: "+res6);
		char res7=s1.charAt(4);
		System.out.println("char at 4 is: "+res7);
		int res8=s1.length();
		System.out.println("length of string is: "+res8);
		int res9=s1.indexOf('m');
		System.out.println("indexOf m is: "+res9);
		boolean res10=s1.contains("Raja");
		System.out.println("contains result: "+res10);
	}

}
