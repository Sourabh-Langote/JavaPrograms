//* * * * *  * * * * *  *       *  * * * * *  * * * * *  * * * * *  *       *
//*          *       *  *       *  *       *  *       *  *       *  *       *
//* * * * *  *       *  *       *  * * * * *  * * * * *  * * * * *  * * * * *
//        *  *       *  *       *  * *        *       *  *       *  *       *
//* * * * *  * * * * *  * * * * *  *   *      *       *  * * * * *  *       *

package gqtcodes;
import java.util.Scanner;
public class MyNamePattern {
	public static void main(String[] args) {
		System.out.println("enter size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				if(i==0 || (j==0 && i<=(n/2)) || i==(n-1) 
			    ||( i==(n/2))|| (j==(n-1) && i>=(n/2))) {       //S
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
			System.out.print("    ");
			for(j=0; j<n; j++) {
				if(i==0 || (j==0) || i==n-1 || j==n-1) {        //O
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
			System.out.print("    ");
			for(j=0; j<n; j++) {
				if((j==0) || i==n-1 || j==n-1) {                //U
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
			System.out.print("    ");
			for(j=0; j<n; j++) {								//R
				if(i==0 || (j==0) || (j==n-1)&& i<=n/2 || (i==n/2) || (i-j==n/2)) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
			System.out.print("    ");
			for(j=0; j<n; j++) {
				if(i==0 || (j==0) || i==n/2 || j==n-1) {		//A
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
			System.out.print("    ");							//B
			for(j=0; j<n; j++) {
				if((i==0)&&(j<n-2) || (j==0) || (i==n-1 && j<n-2) || ((i==n/2) && j<n-2 )||(j==n-2 && i==n/4) ||(j==n-2 && i==3*n/4)) {
				System.out.print("* ");      					
			}
			else {
				System.out.print("  ");
			}
		}
			System.out.print("    ");
			for(j=0; j<n; j++) {
				if((j==0) || i==n/2 || j==n-1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
		
  }
}
