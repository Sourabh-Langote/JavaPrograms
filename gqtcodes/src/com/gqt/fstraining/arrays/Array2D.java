/**
 * 
 */
package com.gqt.fstraining.arrays;
import java.util.Scanner;
/**
 * @author sourabh
 *description: this is the code for demonstration of 2 dimensional array
 *@requirement to store marks of n students from m classrooms
 *
 * class   : 0 1 2 3 
 * students: 2 2 2 2
 */
public class Array2D {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total number of class rooms:");
		int m=sc.nextInt();
		System.out.println("enter the total number of students in each class rooms:");
		int n=sc.nextInt();
		
		int arr[][]=new int[m][n];
		System.out.println("array is ready for operation");
		System.out.println("the length of the outer portion of array:"+arr.length);
		
		//code to store the marks of n students inside the m clas_rooms
		for(int i=0;i<arr.length;i++) {
			System.out.println("the count of the students inside the class"+(i+1)+"is"+arr[i].length);
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the marks of students"+(j+1));
				arr[i][j]=sc.nextInt();		
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside class"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("the marks of student-"+(j+1)+"is"+arr[i][j]);
			}
		}
	}
}
