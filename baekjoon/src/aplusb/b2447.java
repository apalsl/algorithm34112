package aplusb;

import java.util.Scanner;

public class b2447 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		for(int i=1; i<=n*2-1; i++) {
		
			
			if(i<=n) {
				for(int j=1; j<=n*2-i; j++) {
					if(i <= j) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}	
			} else  {
				for(int j=1; j<=i; j++) {
					if(j>=2*n-i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}	
			} 
			if(i!=n*2-1) {
				System.out.println();	
			}
		}
	}
}
