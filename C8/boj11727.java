package C8;

import java.util.*;

public class boj11727 {
	final static int DIV = 10007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[1001];
		
		d[0] = d[1] = 1;
		d[2] = 3;
		for(int i=3; i<=n; i++) {
			d[i] = (d[i-1]+2*d[i-2]) % DIV;
		}
		System.out.println(d[n]);
	}
}
