package C8;

import java.util.*;

public class boj11048 {
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
		
		//(r+1, c), (r, c+1), (r+1, c+1)로 이동
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				d[i][j] += Math.max(d[i-1][j], Math.max(d[i][j-1], d[i-1][j-1])) + a[i][j];
			}
		}
		System.out.println(d[n][m]);
		
	}
}
