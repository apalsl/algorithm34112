package d2.paskal;

import java.util.Scanner;

public class Solution {

	static int arr[][];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T =sc.nextInt();
		
		
		
		for(int test_case =1; test_case<=T; test_case++) {
			int n = sc.nextInt();
			
			arr = new int[n][n];	
			System.out.println("#"+test_case);
			for(int i=0; i<n; i++) {
				for (int j=0; j<=i; j++) {
					if (j==0 || j==i) {
						arr[j][i] = 1;
					} else {
						arr[j][i] = arr[j][i-1]+arr[j-1][i-1];
					}
					System.out.print(arr[j][i] + " ");
				}
				System.out.println();
			}
		}
		
		sc.close();
	}
}
