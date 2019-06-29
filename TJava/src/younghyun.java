import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class younghyun {
	static int arr[];
	static boolean chk[];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int size = (n+1)*(n+1);
		System.out.println("size = " + size);
		List<Integer> list = new ArrayList<>(size);
		arr = new int[n+1];
		chk = new boolean[n+1];
		list.remove(1);
		//배열에 숫자 입력 
		for(int i=0; i<=n; i++) {
			System.out.println("i = " + i );
			arr[i] = i;
			chk[i] = false;
		}
		
		for(int i=0; i<=n; i++) {
			
			
		}
		
		for(int i=0; i<size; i++) {
			System.out.println(list.get(i));
		}
		
		
		
	}
	
}
