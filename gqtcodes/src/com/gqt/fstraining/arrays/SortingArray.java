/**
 * 
 */
package com.gqt.fstraining.arrays;

import java.util.Iterator;

/**
 * @author sourabh
 *description:sorting the elements in the given array without built in function
 */
public class SortingArray {
	/**
	 * @param args
	 * @param arr
	 * @param temp
	 */
	public static void main(String[] args) {
		int arr[]= {43,54,22,4,8,79,33};
		int temp;
		System.out.println("before the sorting of array");
		 for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		 for (int i = 0; i < arr.length; i++) {
			 for (int j =i+1; j < arr.length; j++) {
					if(arr[i]>arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
			}

		}
		 System.out.println("after the sorting of array");
		 for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
