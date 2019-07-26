package C8;

import java.util.*;

public class boj9251 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int d[][] = new int[s1.length()+1][s2.length()+1];
		
		for(int i=1; i<=s1.length(); i++) {
			char c1 = s1.charAt(i-1);
			for(int j=1; j<=s2.length(); j++) {
				char c2 = s2.charAt(j-1);
				
				if(c1==c2)
					d[i][j] = d[i-1][j-1]+1;
				else
					d[i][j] = Math.max(d[i-1][j], d[i][j-1]);
			}
		}
		System.out.println(d[s1.length()][s2.length()]);
	}
}
