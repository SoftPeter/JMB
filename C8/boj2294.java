package C8;

import java.util.*;

public class boj2294 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n+1];
		int d[] = new int[k+1];
		
		for(int i=1; i<=n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=1; i<=k; i++) {
			d[i] = 10001;
		}
		
		d[0] = 0;
		for(int i=1; i<=n; i++) {
			for(int j=a[i]; j<=k; j++) {
				d[j] = Math.min(d[j], d[j-a[i]]+1);
			}
		}
		
		if(d[k]==10001)
			d[k] = -1;
		System.out.println(d[k]);
	}
}
