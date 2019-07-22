package C8;

import java.util.*;

public class boj11726 {
	final static int DIV = 10007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n+1];
		d[0]=d[1]=1;
		for(int i=2; i<=n; i++) {
			d[i] = (d[i-1] + d[i-2]) % DIV;
		}
		System.out.println(d[n]);
	}
}
