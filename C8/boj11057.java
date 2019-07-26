package C8;

import java.util.*;

public class boj11057 {
	final static int div = 10007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d[][] = new long[1001][11];
		
		for(int i=0; i<=9; i++) {
			d[1][i] = 1;
		}
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<=9; j++) {
				for(int k=0; k<=j; k++) {
					d[i][j] += d[i-1][k];
					d[i][j] %= div;
				}
			}
		}
		
		long ans = 0;
		for(int i=0; i<=9; i++) {
			ans += d[n][i];
		}
		System.out.println(ans%div);
	}
}
