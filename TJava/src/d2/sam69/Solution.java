package d2.sam69;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			String cnt = "";
			int num = i;
			while(num>0) {
				int value = num%10;
				if(value == 3 || value == 6 || value == 9) {
//					System.out.println("-");
					cnt +="-";
				} 
				num = num/10;
			}
			if(cnt.equals("")) {
				cnt += i;
			}
			System.out.print(cnt + " ");
			
		}

	}

}
