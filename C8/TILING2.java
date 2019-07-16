package C8;

import java.util.*;
import java.io.*;

public class TILING2 {
	static int n;
	static int[] tmp = new int[101];
	final static int MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = Integer.parseInt(sc.next());
		for(int tc=0; tc<C; tc++) {
			n = Integer.parseInt(sc.next());
			tmp[0]=tmp[1]=1;
			for(int i=2; i<=n; i++) {
				tmp[i] = (tmp[i-2]+tmp[i-1])%MOD;
			}
			System.out.println(tmp[n]);
		}
	}
}