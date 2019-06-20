package aplusb;

import java.util.Scanner;

public class b2445 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n*2-1; i++) {
			if(i<n) {
				for(int j=1; j<=n*2-1; j++) {
					if(j<=i || n*2-i <=j  ) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
					if(j==n) {
						System.out.print(" ");
					}
					
				}	
			} else if(i == n) {
				for(int j=1; j<=n*2; j++) {
					System.out.print("*");
				}
				
				
			} else {
				for(int j=1; j<=n*2-1; j++) {
					if( j>=i  || 2*n -j >=i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
					if(j==n) {
						System.out.print(" ");
					}
					
				}
			}
			

				System.out.println();
		
		}
	}
}

