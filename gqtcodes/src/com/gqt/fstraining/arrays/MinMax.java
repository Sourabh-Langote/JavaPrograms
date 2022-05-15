/**
 * 
 */
package com.gqt.fstraining.arrays;

/**
 * @author sourabh
 *Description: finding min and max from the given array
 */
public class MinMax {
	/**
	 * @param
	 */
	public static void main(String[] args) {
		int arr[]= {2,45,6,3,6,6,654,22,3,34,5,6,4};
		System.out.println("array elements are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
			int min=arr[0];
			int max=arr[0];
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]<min) {
					min=arr[i];
		}
			}
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]>max) {
					max=arr[i];
		}
			}
			System.out.println("min value is:"+min);
			System.out.println("max value is:"+max);
	}

}
