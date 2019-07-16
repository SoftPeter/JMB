package C8;

import java.util.*;
import java.io.*;

public class LIS {
	static int n;
	static int[] S;
	static int[] tmp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = Integer.parseInt(sc.next());
		for(int tc=0; tc<C; tc++) {
			n = Integer.parseInt(sc.next());
			S = new int[n];
			tmp = new int[n];
			
			for(int i=0; i<n; i++) {
				S[i] = Integer.parseInt(sc.next());
			}
			
			for(int i=0; i<n; i++) {
				tmp[i] = 1;
				for(int j=0; j<i; j++) {
					if(S[i]>S[j] && tmp[i] < tmp[j]+1)
						tmp[i] = tmp[j]+1;
				}
			}
			
			int ans=0;
			for(int i=0; i<n; i++) {
				if(ans < tmp[i])
					ans = tmp[i];
			}
			System.out.println(ans);
		}
	}
}