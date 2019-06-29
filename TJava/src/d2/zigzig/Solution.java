package d2.zigzig;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int test_case =1; test_case<=T; test_case++) {
			
			float sum = 0;
			float max = 0;
			float min = 1000;
			for(int i=0; i<10; i++) {
				int n = sc.nextInt();
				sum += n;	
				if (max < n) {
					max = n;
				}
				
				if (min >n) {
					min = n;
				}
			}
			
			float zz = (sum - min - max)/8;
			System.out.println("#"+test_case+" "+Math.round(zz));
		}
	}

}