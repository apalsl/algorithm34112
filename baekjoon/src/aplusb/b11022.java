package aplusb;

import java.util.*;
public class b11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=1; i<=T; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a+b;
			
			System.out.println("Case #"+i+": " + a +" + "+b+ " = "+c );
		}
	}
}
