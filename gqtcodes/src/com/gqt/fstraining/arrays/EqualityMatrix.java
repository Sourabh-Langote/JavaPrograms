/**
 * 
 */
package com.gqt.fstraining.arrays;

/**
 * @author sourabh
 *Description:to check the given 2 matrix are equal or not
 */
public class EqualityMatrix {
	public static void main(String[] args) {
		int r1,r2,c1,c2;
		
		int arr1[][]= {{21,23},{12,24}};
		int arr2[][]= {{21,23},{12,24}};
		
		boolean res=true;
		r1=arr1.length;
		r2=arr2.length;
		c1=arr1[0].length;
		c2=arr2[0].length;
	
		if(r1!=r2 || c1!=c2) {
			res=false;
			System.out.println("matrix are not equal");
		}
		else {
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if(arr1[i][j]!=arr2[i][j]) {
					res=false;
					System.out.println("matrix is not equal");
					break;
				}
			}
		}
	}
	if(res==true) {
		System.out.println("matrix is equal");
	}
	}
}
