package C8;

import java.util.*;

public class boj9461 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- > 0) {
			int n = sc.nextInt();
			long d[] = new long[101];
			//1, 1, 1, 2, 2, 3, 4, 5, 7, 9
			d[1] = d[2] = d[3] = 1;
			d[4] = d[5] = 2;
			for(int i=6; i<=n; i++) {
				d[i] = d[i-1]+d[i-5];
			}
			System.out.println(d[n]);
		}
	}
}
