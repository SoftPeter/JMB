package C8;

import java.util.*;

public class boj11722 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n+1];
		int d[] = new int[n+1];
		for(int i=1; i<=n; i++) {
			a[i] = sc.nextInt();
			d[i]=1;
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(a[i]<a[j] && d[i]<d[j]+1) {
					d[i]=d[j]+1;
					//System.out.print(d[i] + " ");
				}
			}
		}
		
		int ans=0;
		for(int i=1; i<=n; i++) {
			if(ans < d[i])
				ans = d[i];
		}
		System.out.println(ans);
	}
}
