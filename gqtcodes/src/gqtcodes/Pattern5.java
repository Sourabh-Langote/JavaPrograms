//* 
//* *
//* - *
//* - - *
//* - - - *
//* * * * * *

package gqtcodes;
public class Pattern5 {

	public static void main(String[] args) {
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				if(i==0 || i==0 || j==0 || i==j) {
					System.out.print("*");
					System.out.print(" ");
				}
			
			else {
				System.out.print("-");
				System.out.print(" ");
			}
		}
			System.out.println();
	}
	}

}
