package C8;

import java.util.*;

public class boj2579 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n+1];
		int d[] = new int[n+1];
		for(int i=1; i<=n; i++) {
			a[i] = sc.nextInt();
		}
		d[1] = a[1];
		d[2] = a[1]+a[2];
		for(int i=3; i<=n; i++) {
			d[i] = Math.max(d[i-2]+a[i], d[i-3]+a[i-1]+a[i]);
		}
		System.out.println(d[n]);
	}
}
