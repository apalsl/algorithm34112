package aplusb;

import java.util.Scanner;

public class b11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String str = sc.next();
		int a;
		int b = 0;
		for(int i=0; i<t; i++) {
			a = str.charAt(i) - '0';
			b +=a;
		}
		System.out.println(b);
		
	}
}
