package d2.sigak;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		Date day1 = null;
		Date day2 = null;
		for(int T=1; T<=t; T++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int z = sc.nextInt();
				int o = sc.nextInt();
				GregorianCalendar str = new GregorianCalendar(2019, x, y);
				GregorianCalendar str2 = new GregorianCalendar(2019, z, o);
				
				day1 = str.getTime();
				day2 = str2.getTime();
				
				long diff = day2.getTime() - day1.getTime();
				int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
				long result = diffDays+1;
				
				System.out.p
				rintln(diffDays);
				System.out.println("#"+T+" " +result);
			
			
		}
		sc.close();
	}

}
