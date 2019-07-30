package C8;

import java.util.*;

public class boj1890 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		long d[][] = new long[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		d[0][0] = 1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==n-1 && j==n-1)
					continue;
				int next = a[i][j];
				if(i+next < n)
					d[i+next][j] += d[i][j];
				if(j+next < n)
					d[i][j+next] += d[i][j];
			}
		}
		System.out.println(d[n-1][n-1]);
	}
}
