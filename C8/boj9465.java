package C8;

import java.util.*;
import java.io.*;
public class boj9465 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while(tc-- > 0) {
			int n = Integer.parseInt(br.readLine());
			long a[][] = new long[n+1][2];
			String line1[] = br.readLine().split(" ");
			for(int i=1; i<=n; i++)
				a[i][0] = Integer.parseInt(line1[i-1]);
			String line2[] = br.readLine().split(" ");
			for(int i=1; i<=n; i++)
				a[i][1] = Integer.parseInt(line2[i-1]);
			
			long d[][] = new long[n+1][3];
			for(int i=1; i<=n; i++) {
				d[i][0] = Math.max(d[i-1][0], Math.max(d[i-1][1], d[i-1][2]));
				d[i][1] = Math.max(d[i-1][0], d[i-1][2]) + a[i][0];
				d[i][2] = Math.max(d[i-1][0], d[i-1][1]) + a[i][1];
			}
			
			long ans=0;
			ans = Math.max(d[n][0], Math.max(d[n][1], d[n][2]));
			System.out.println(ans);
		}
	}
}
