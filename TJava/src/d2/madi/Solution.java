package d2.madi;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		char chk[] = new char[30];
		char chk2[] = new char[30];
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int test_case=1; test_case<=t; test_case++) {
			int test = 0;
			String str = sc.next();
			for(int i=0; i<30; i++) {
//				System.out.println("str = " + str.charAt(i));
				chk[i] = str.charAt(i);
				chk2[i] = str.charAt(i);
			}
			
			first : for(int i=1; i<=10; i++) {
				if (chk[0] == chk[i]) {
					test = i - 0;
					for(int j=1; j<=i; j++) {
						if(chk[j] != chk2[j+i]) {
							continue first;
						}
					}
					break first;
				}
			}
			System.out.println("#"+test_case+" "+test);
		}
		sc.close();
	}
}
