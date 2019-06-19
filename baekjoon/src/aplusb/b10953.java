package aplusb;

import java.util.Scanner;

public class b10953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int a,b = 0;
		String str = "";
		for(int i=1; i<=T; i++) {
			str = sc.next();
//			System.out.println("str = " + str);
//			System.out.println("strindexof = " + str.charAt(0));
//			System.out.println("strindexof = " + str.charAt(2));
//			
			
			a = Integer.valueOf(str.charAt(0) - '0');
			b = Integer.valueOf(str.charAt(2) - '0');
			System.out.println(a+b);
		}
		
		
	}
}
