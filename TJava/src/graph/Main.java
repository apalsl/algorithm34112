package graph;

import java.util.Scanner;

public class Main {

	
	private static int n;
	private static int info[][];
	private static int asknum[];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); // test_case init
		
		for (int test_case = 0; test_case<n; test_case++) {
			
			int V = sc.nextInt();
			int E = sc.nextInt();
			int ask = sc.nextInt();
			
			info = new int[E][E];
			asknum = new int[ask];
 			
			
			for (int line_info = 0; line_info<E; line_info++) {
				int one = sc.nextInt();
				int two = sc.nextInt();
				info[one][two] = 1;
			}
			
			for (int i=0; i<ask; i++) {
				int num = sc.nextInt();
				asknum[i] = num;
			}
		}
	}
	
	
	

}
