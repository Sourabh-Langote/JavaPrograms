/**
 * 
 */
package com.gqt.fstraining.arrays;
import java.util.Scanner;
/**
 * @author sourabh
 *description: this is code of demonstration of one dimentional array
 *requirements : to store marks of 5 students
 */
public class Array1D {
	/**
	 * 
	 * @param args
	 * @param sc
	 * @param arr
	 * @param 
	 */
	public static void main(String[] args) {
		System.out.println("enter the number of students");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("array is ready for operation");
		System.out.println("length of the array is "+arr.length);
		
		//the code to collect the marks of n students
		for(int i=0; i<arr.length;i++) {
			System.out.println("enter the marks of student:"+(i+1));
			arr[i]=sc.nextInt();
		}
		//the code to display the marks of n students
		for(int i=0; i<arr.length;i++) {
			System.out.println("the marks of student:"+(i+1)+"is"+arr[i]);
		}
	}

}
