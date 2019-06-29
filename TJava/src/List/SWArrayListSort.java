package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SWArrayListSort {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<T; i++) {
			int value = sc.nextInt();
			list.add(value);
		}
		
		Collections.sort(list);
		
//		
//		System.out.println("list.size()%2= " + list.size()%2);
//		System.out.println("list.size()/2= " + list.size()/2+1);
//		
		System.out.println(list.get(list.size()/2));
	
		sc.close();
	}

}
