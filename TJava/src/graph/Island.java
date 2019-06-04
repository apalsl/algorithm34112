package graph;

import java.util.Scanner;


public class Island {

	static final int MAX_VALUE = 50;
	static int map[][] = new int[MAX_VALUE][MAX_VALUE];
	static boolean visit[][] = new boolean[MAX_VALUE][MAX_VALUE]; 
	static int cnt[];
	static int sx[] = {-1, -1, -1,  0,  0,  1, 1, 1};
	static int sy[] = {-1,  0,  1 ,-1 , 1, -1, 0, 1};
	
	
	public static void dfs(int x, int y) {
		visit[x][y] = true;
		map[x][y] = 2;
		
		for(int i=0; i<sx.length; i++) {
			int dx = x + sx[i];
			int dy = y + sy[i];
			
			if (dx > -1 && dx < 50 && dy > -1 && dy < 50) {
				if (visit[dx][dy] == false && map[dx][dy] == 1) {
					dfs(dx,dy);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		while(w != 0 && h != 0) {
			int count = 0;
			for(int i=0; i<51; i++) {
				for(int j=0; j<51; j++) {
					map[i][j] = 0;
					visit[i][j] = false;
				}
			}
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					int x = sc.nextInt();
					map[i][j] = x;
				}
			}
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if (visit[i][j] == false && map[i][j] == 1) {
						count++;
						dfs(i,j);
					}
				}
			}
			System.out.println(count);
			w = sc.nextInt();
			h = sc.nextInt();
		}
//		sc.close();
	}

}
