package d2.sam;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i=1; i<=n; i++) {
			String print = "";
			int t=i;
			while(t>0) {
				int value = t%10;
				if (value == 0) {
					
				} else if(value%3==0 || value%6==0 ||value%9==0) {
					print += "- ";
//					System.out.println("DDDDDDDDDDD     " + value);
				} else {
					print += i+" ";
				}
				t = t/10;
			}
			System.out.print(print);
			
		}
		
		
		
		
	}

}
