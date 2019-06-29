package d2.jumsu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] result = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
		
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case<=T; test_case++) {
			
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int room2= 0;
			List<Integer> room = new ArrayList<>(n);
			
			for(int i=1; i<=n; i++) {
				int center = sc.nextInt();
				int after = sc.nextInt();
				int bonus = sc.nextInt();
				
				room.add(center*35 + after*45 + bonus*20);
				
				if (i ==k) {
					room2 = center*35 + after*45 + bonus*20;
				}
				
			}
			
//			test : for(int i=0; i<n; i++) {
//				System.out.println(room.get(i));
//				}
//			
//			System.out.println("__________________________________________");
			Collections.sort(room);
			Collections.reverse(room);
			
//			int q = 0;
////			test : for(int i=0; i<n; i++) {
////			System.out.println(room.get(i));
////			}
			
			
			int q = 0;
			test : for(int i=0; i<n; i++) {
				if(room.get(i) == room2) {
					q = i;
					break test;
				}
			}
//			System.out.println("Qqq =  " + q);
			
			int m = n/10;
//			System.out.println("M =  " + m);
			// m 3 �̸� 30 A+ 3��
			
			// q�� 9�ε� n�� 30�̸�         01 23 45 67 89 1011 1213 1415 /            
			q = q/m;
//			System.out.println("Q =  " + q);
			
			
// q�� 4�ϋ� n 20�̶�� q == A-        01234
			
			System.out.println("#"+test_case+ " " +result[q%10]);	
			
			
			
		}
		
		
	}
}
