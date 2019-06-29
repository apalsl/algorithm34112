package d2.hoemun;

import java.util.Scanner;

public class Solution {
	static boolean chk;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; test_case++) {
			String str = sc.next();
			int n = str.length()/2;
			
			if (str.length()==0) {
				System.out.println("#" +test_case+ " " +1);
				continue;
			}
			
			if (n%2 == 1 && n != 1) {
				System.out.println("#" +test_case+ " " +0);
				continue;
			}
			int back =0, pre = 0;
			chk = false;
			test : for(int i=1; i<=str.length()/2; i++) {
				--back;
				++pre;
				if(str.charAt(n+back) != str.charAt(n+pre)) {
					chk = true;
					break test;
				}
			}	
			
			if (chk){
				System.out.println("#" +test_case+ " " +0);
			} else {
				System.out.println("#" +test_case+ " " +1);
			}
		}
		sc.close();
	}

}
