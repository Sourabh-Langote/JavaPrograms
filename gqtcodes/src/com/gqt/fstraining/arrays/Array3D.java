package com.gqt.fstraining.arrays;
import java.util.Scanner;
/**
 * @author sourabh
 *Description: this is the code for demonstration of 3 dimensional array
 *requirements: to store the marks of n students from m class rooms and o colleges
 *college :  0	     1	     2	    3
 *class   :0   1   0    1  0   1  0   1
 *students:2   2   2    2  2   2  2   2 
 */
public class Array3D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of colleges : ");
		int m=sc.nextInt();
		System.out.println("enter the number of class-rooms : ");
		int n=sc.nextInt();
		System.out.println("enter the number of students : ");
		int o=sc.nextInt();
		
		int arr[][][]=new int[m][n][o];
		System.out.println("array is created");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the college"+i);
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside the class"+j);
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter themarks of student :"+(k+1));
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the college"+i);
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside the class"+j);
				for(int k=0;k<arr[j].length;k++) {
					System.out.println("the student "+(k+1)+"marks is"+arr[i][j][k]);
				}
					
				}
	}

}
}
