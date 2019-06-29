package aplusb;

import java.util.Scanner;

public class b8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++) {
			int value = i;
			sum +=value;
		}
		System.out.println(sum);

	}

}
