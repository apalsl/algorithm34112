package aplusb;

import java.util.Scanner;

public class b10991 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if (n==1) {
				System.out.print("*");
			} else {      
				for(int j=1; j<=n+i-1; j++) {
				
				if (n%2 == 1) {
					if(j >=n-i+1)	{
						if(i%2 ==0) { 
							if(j%2 == 1) {   
								System.out.print(" ");	
							} else {        
								System.out.print("*");	
							}
						} else if(i%2 == 1){ //
//							System.out.println("i = " + i + " j = " + j);
							if(j%2 == 0) { // 
								System.out.print(" ");	
							} else {         //
								System.out.print("*");	
							}
						}	
					} else {
						System.out.print(" ");	
					}
				} else {
					if(j >=n-i+1)	{
						if(i%2 ==0) { 
							if(j%2 == 1) {   
								System.out.print("*");	
							} else {        
								System.out.print(" ");	
							}
						} else if(i%2 == 1){ //
//							System.out.println("i = " + i + " j = " + j);
							if(j%2 == 0) { // 
								System.out.print("*");	
							} else {         //
								System.out.print(" ");	
							}
						}	
					} else {
						System.out.print(" ");	
					}
				}
			}
			}
			if(i != n) {
				System.out.println();	
			}
		}
		
	}
}

  //1       3
//  2      2 4      4-2+1  n-i+1 or n+i-1
//  3     1 3 5     4-3+1  n-i+1 or n+i-1
//  4    1 3 5 7    4-3+1, 4-4+1, 4-4+3