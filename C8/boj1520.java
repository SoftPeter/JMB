package C8;

import java.util.*;

public class boj1520 {
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	static int m, n;
	static int a[][], d[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt(); //행 
		n = sc.nextInt(); //열 
		a = new int[m][n];
		d = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = sc.nextInt();
				d[i][j] = -1;
			}
		}
		System.out.println(dfs(m-1,n-1));
	}
	
	private static int dfs(int x, int y) {
		if(x==0 && y==0)
			return 1;
		if(d[x][y] == -1) {
			d[x][y] = 0;
			for(int i=0; i<dx.length; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(0<=nx && 0<=ny && nx<m && ny<n) {
					if(a[x][y] < a[nx][ny]) {
						d[x][y] += dfs(nx, ny);
					}
				}
				
			}
		}
		return d[x][y];
	}
}
