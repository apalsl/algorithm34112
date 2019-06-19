package aplusb;

import java.util.Scanner;

public class b10818 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int min = 1000000;
		int max = -1000000;
		for(int i=0; i<n; i++) {
			int value = sc.nextInt();
			
			if(value<min) {
				min = value;
			}
			
			if(value>max) {
				max = value;
			}
		}
		
		System.out.println(min+" "+max);
	}

}
