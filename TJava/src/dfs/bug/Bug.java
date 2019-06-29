package dfs.bug;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Bug {
	
	static int MAX_VALUE = 51;
	static int[] sx = {0,1,0,-1};
	static int[] sy = {1,0,-1,0};
	static boolean[][] visit;
	static int[][] map;
	static Queue<Integer> q;
	static Stack<Integer> stack;
	
	static int cnt[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		cnt = new int[T];
		for(int test_case = 0; test_case<T; test_case++) {
			visit = new boolean[MAX_VALUE][MAX_VALUE];
			map = new int[MAX_VALUE][MAX_VALUE];
			
			int M = sc.nextInt();
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			
			for (int init=0; init<K; init++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				map[a][b] = 1;
			}
			
			
			for (int i=0; i<M; i++) {
				for (int j=0; j<N; j++) {	
					if(map[i][j] == 1 && visit[i][j] == false) {
						cnt[test_case]++;
						dfs(i,j);
					}
				}
			}
			
		}
		
		
		for(int i=0; i<T; i++) {
			System.out.println(cnt[i]);
		}
	}
	
	static void dfs(int m, int n) {
		visit[m][n] = true;
		
		for(int i=0; i<4; i++) {
			int dm = m + sx[i];
			int dn = n + sy[i];
			
			if (dm>-1 && dm<51 && dn>-1 && dn <51) {
				if ( visit[dm][dn] == false && map[dm][dn] == 1) {
					dfs(dm,dn);
				}
			}
		}
	}
	

}
