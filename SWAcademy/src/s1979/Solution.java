package s1979;

import java.util.Scanner;

public class Solution {
	static int MAX_VALUE  = 15;
	static int arr[][];
	static boolean chk[][];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int test_case =1; test_case <=n; test_case++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			arr = new int[N][N];
			chk = new boolean[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
					chk[i][j] = false;
				}
			}
			
			
			int cnt =0;
			for(int i=0; i<N; i++) {
				int count =0;
				for(int j=0; j<N; j++) {
					if(arr[i][j] == 1) {
						count++;
					}  else {
						if(count == K) {
							cnt++;
							count =0;
						} else {
							count =0;
						}
					}
					
					if (j == N-1){
						if(count == K) {
							cnt++;
						}
					}
				}
			}
			
			for(int i=0; i<N; i++) {
				int count = 0;
				for(int j=0; j<N; j++) {
					if(arr[j][i] == 1) {
						count++;
					} else {
						if(count == K) {
							cnt++;
							count =0;
						} else {
							count =0;
						}
					}
					if (j == N-1){
						if(count == K) {
							cnt++;
						}
					}
				}
			}
			
			System.out.println("#" +test_case + " " + cnt);
		}

	}

}
