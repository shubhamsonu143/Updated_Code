package Runner_Lib;

import java.util.Scanner;

public class Loop_Examples {

	public static void main(String[] args) {

		int i = 0, j = 0;

		int n;

		// ************************* for loop ***************//
		Scanner s = new Scanner(System.in);

		System.out.println("eneter the nummber");

		n = s.nextInt();

		for (i = 0; i <= n; i++) {

			for (j = 0; j <=n-i; j++) {

				System.out.print("*");
			}
			
			System.out.println("");

		}
//		

		// while loop
//		while(i<=n) {
//			
//			System.out.println("*");
//			i++;
//			
//			
//			
//		}
//
//		do{
//			System.out.println("123");
//			i++;
//		}while(i<=n); {
//			
//			System.out.println("2122");
//			
//		}

	}
}
