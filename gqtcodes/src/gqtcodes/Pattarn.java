package gqtcodes;

public class Pattarn {

//	public static void main(String[] args) {
//		for(int i=1;i<=10;i++)
//			System.out.print("*");
//	}
	
	
//	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
//	public static void main(String[] args) {
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
//	public static void main(String[] args) {
//		for(int i=1; i<=5; i++) {
//			for(int j=5; j>=i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	public static void main(String[] args) {
		int count=1;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}
}
