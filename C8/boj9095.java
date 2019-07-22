package C8;

import java.util.*;

public class boj9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int d[] = new int[11];
		d[0] = 1;
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
		for(int tc=0; tc<t; tc++) {
			int n = sc.nextInt();
			for(int i=4; i<=n; i++) {
				d[i] = d[i-1]+d[i-2]+d[i-3];
			}
			System.out.println(d[n]);
		}
	}
}
