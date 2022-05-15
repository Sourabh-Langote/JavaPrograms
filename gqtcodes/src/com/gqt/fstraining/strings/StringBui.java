/**
 * 
 */
package com.gqt.fstraining.strings;

/**
 * @author sourabh
 *
 */
public class StringBui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Ramayana");
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(0));
		StringBuilder sb1=new StringBuilder("Ramayana");
		System.out.println(sb.compareTo(sb1));
		StringBuilder sb2=new StringBuilder("ramayana");
		System.out.println(sb.compareTo(sb2));
		sb.delete(5, 7);
		System.out.println(sb);
		sb.deleteCharAt(2);
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(80);
		System.out.println(sb.capacity());
		System.out.println(sb.equals(sb1));
		System.out.println(sb.equals(sb));
		System.out.println(sb.getClass());
		System.out.println(sb.indexOf("a"));
		System.out.println(sb.isEmpty());
		System.out.println(sb.lastIndexOf("a"));
		System.out.println(sb.length());
		sb.replace(0,4,"sita");
		System.out.println(sb);
		System.out.println(sb.reverse());
		sb.setCharAt(2, 's');
		System.out.println(sb);
		System.out.println(sb.length());
		sb.setLength(10);
		System.out.println(sb.length());
		System.out.println(sb.substring(4));
		sb.append(sb1);
		System.out.println(sb);
	}

}
