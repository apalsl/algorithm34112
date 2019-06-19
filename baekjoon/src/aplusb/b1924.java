package aplusb;

import java.util.Scanner;

public class b1924 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int day[] = {0,0,31,59,90,120,151,181,212,243,273,304,334};
		for(int i=1; i<=12; i++) {
			if(x == i) {
				y += day[i];
				break;
			}
		}
		
		switch (y%7) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 0:
			System.out.println("SUN");
			break;
		}
	}

}
