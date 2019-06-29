package simulation;

import java.util.Scanner;

public class Main {

	static int MAX_VALUE = 100;
	private static int map[][] = new int[MAX_VALUE][MAX_VALUE];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int test_case =0; test_case<n; test_case++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int d = sc.nextInt();
			int g = sc.nextInt();
			
			map[x][y] = 1;
			
			if (d == 0) {
				// x + 1
				map[x+1][y] = 1;
			} else if (d == 1) { 
				// y - 1
				map[x][y-1] = 1;
			} else if (d == 2) {
				// x - 1
				map[x-1][y] = 1;
			} else if (d == 3) {
				// y + 1
				map[x][y+1] = 1;
			}
			
			
			
			while(g == 0) {
				
				
				
			}
			
			
			
			
		}
		
		

	}

}
