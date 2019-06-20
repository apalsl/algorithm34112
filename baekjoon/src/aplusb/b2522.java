package aplusb;

import java.util.Scanner;

public class b2522 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=2*n-1; i++) {
			for(int j=1; j<=n; j++) {
				//1  3
				//2 23
				//3 123
				if (i <=n) {
					if(j>n-i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}	
				} else {
					if(i-n <j) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}	
				}
						
				// 4 23
				
			}
			if(i!=2*n-1) {
				System.out.println();	
			}
		}
	}
	
}
