package d2.puzzle;

import java.util.Scanner;

public class Solution {
	static int[][] arr;
	static int n;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int test_case =1; test_case<=T; test_case++) {
			n = sc.nextInt();
			int k = sc.nextInt();
			
			arr = new int[n][n];
			
			int count = 0;
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			
			for(int i=0; i<n; i++) {
				System.out.println();
				for(int j=0; j<n; j++) {
					if(arr[i][j] == 1) {
						boolean chk = findXLine(i,j,k);
						if(chk) {
							count++;
						} 
						chk = findYLine(i,j,k);
						if(chk) {
							count++;
						} else {
							continue;
						}
					}
				}
			}
			
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			
			System.out.println("#"+test_case+" "+count);
		}
		

	}
	
	private static boolean findYLine(int i, int j, int k) {
		

		if(i==0 && i+k ==0 || i+k == n-1 && i-1 ==0  || i-1>0 && i+k <n-1 && i-1 !=0 && i+k != 0) {
			for(int n=1; n<k; n++) {
				if (arr[i+n][j] != 1) {
					return false;
				} else {
					arr[i+n][j] = 2;
				}
			}
			return true;
		}
		return false;
	}

	private static boolean findXLine(int i, int j, int k) {
		if(j==0 && j+k ==0 || j+k == n-1 && i-1 ==0  || j-1>0 && j+k <n-1 && j-1 !=0 && j+k != 0) {
			for(int n=1; n<k; n++) {
				if (arr[i][j+n] != 1) {
					return false;
				} else {
					arr[i][j+n] = 2;
				}
			}
			return true;
		} 
			return false;
	}
}
