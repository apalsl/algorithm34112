
public class Solution {

	public static void main(String[] args) {
		int[] testq = new int[5];
		int sum=0;
		for(int i=0; i<5; i++) {
			testq[i] = i+1;
			sum +=testq[i];
		}
		
		System.out.println(sum);
	}

}
