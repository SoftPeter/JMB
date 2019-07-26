package C8;

import java.util.*;

public class boj2167 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n+1][m+1];
		int d[][] = new int[n+1][m+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int k = sc.nextInt();
		
		for(int t=0; t<k; t++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int tx=i; tx<=x; tx++) {
				for(int ty=j; ty<=y; ty++) {
					d[x][y] += a[tx][ty];
				}
			}
			System.out.println(d[x][y]);
			d[x][y] = 0;
		}
	}
}
