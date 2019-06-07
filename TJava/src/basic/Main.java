package basic;

public class Main {

	public static void main(String[] args) {
		int cnt =0;
		for (cnt=0; cnt<1000; cnt++) {
			cnt++;
			if (cnt%2 == 1) {
				System.out.println("Korea");
			} else {
				System.out.println("Yonsei");
			}
		}
	}
}
