package d2.paris;

import java.util.Scanner;

public class Solution {
	
	static int arr[][];
//	static int max;
	static int m;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int n = sc.nextInt();
			m = sc.nextInt();
			
			arr = new int[n][n];
//			max = 0;
			
			for(int i=0; i<n; i++) {
				for (int j=0; j<n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int max= 0;
			for(int i=0; i<n-m+1; i++) {
				for(int j=0; j<n-m+1; j++) {
					int sum = find(i,j);
					if (max < sum) {
						max = sum;
					}
				}
			}
			
			System.out.println("#"+test_case+" "+ +max);
		}
	}
	private static int find(int x, int y) {
		int sum = 0;
		for(int i=x; i<x+m; i++) {
			for(int j=y; j<y+m; j++) {
				sum += arr[i][j];
			}
		}
		
		return sum;
	}
}
