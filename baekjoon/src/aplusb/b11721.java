package aplusb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b11721 {

	static final int MAX = 10;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		
		int length = str.length();
		
		List list = new ArrayList<>(length/MAX+10);
		
		
		for(int i=0;i<length; i+=MAX) {
			if(i+MAX < length) {
				list.add(str.substring(i,i+MAX));
			} else {
				list.add(str.substring(i));
			}
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
