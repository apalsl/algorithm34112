package d2.garosero;

import java.util.Scanner;

import java.util.Scanner;

public class Solution {

	static int[][] arr = new int[15][15];
	static boolean[][] chk = new boolean[15][15];
	static int n;
	static int k;
	static int sum;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		for(int t=1; t<=T; t++) {
			n = sc.nextInt();
			k = sc.nextInt();

			for(int i=0; i<15; i++) {
				for(int j=0; j<15; j++) {
					arr[i][j] = 2;
					chk[i][j] = true;
				}
			}
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++){
					arr[i][j] = sc.nextInt();
				}
			}
			int sum = 0;
			for(int i=0; i<n; i++) {
				for(int j=0; j<n-k+1; j++) {
					int check =0;
					if(arr[i][j] == 1 && chk[i][j] == true) {
						for(int z =0; z<k; z++) {
							if(arr[i][j+z] == 1 && chk[i][j+z] == true) {
								check++;
							}
						}
						
					}
					if(check == k) {
						sum++;
					}
				}
			}
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++){
					System.out.print(arr[i][j]+ " ");
				}
				System.out.println();
			}
		}
	}
	
	static void search(int i, int j) {
		chk[i][j] = false;
		arr[i][j] = 3;
		if(arr[i][j+1] == 1 && chk[i][j+1] == true) {
			search(i,j+1);
		}
		
	}

}
