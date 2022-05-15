/**
 * 
 */
package com.gqt.fstraining.arrays;

/**
 * @author sourabh
 *Description:this code is to demonstrate the addition of 2 matrix
 */
public class MatrixAddition {
	public static void main(String[] args) {
		int r,c;
		int arr1[][]= {{21,23},{45,56}}; //array-1
		int arr2[][]= {{65,67},{89,96}}; //array-2
	
		//new array to store addition
		int res[][]=new int[arr1.length][arr1[0].length];
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				res[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(res[i][j] +"   ");
	}
			System.out.println();
}
}
}