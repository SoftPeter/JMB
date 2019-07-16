package C8;

import java.util.*;
import java.io.*;

public class ASYMTILING {
	static int n;
	static long[] tmp = new long[101];
	final static int MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = Integer.parseInt(sc.next());
		for(int tc=0; tc<C; tc++) {
			n = Integer.parseInt(sc.next());
			Arrays.fill(tmp, -1);
			
			long result = asymmetric(n);
			long dup = asymmetric(n/2+1);
			System.out.println((result-dup+MOD)%MOD);
		}
	}
	private static long asymmetric(int n) {
		if(n<=1)
			return 1;
		if(tmp[n] != -1)
			return tmp[n];
		
		return tmp[n] = (asymmetric(n-2) + asymmetric(n-1))%MOD; 
	}
}