package aplusb;

import java.util.Scanner;

public class b10992 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i<n) {
				for(int j=1; j<=n+i-1; j++) {
					if(j == n-i+1 ||j== n+i-1) {
						System.out.print("*");	
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			} else {
				for(int j=1; j<=n+i-1; j++) {
					System.out.print("*");
				}
			}
			
			
		}

	}

}
