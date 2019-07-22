package C8;

import java.util.*;

public class boj1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] d = new int[41][2];
		d[0][0] = 1;
		d[0][1] = 0;
		d[1][0] = 0;
		d[1][1] = 1;
		for(int i=2; i<41; i++) {
			for(int j=0; j<=1; j++) {
				d[i][j] = d[i-1][j] + d[i-2][j];
			}
		}
		
		
		int t = sc.nextInt();
		for(int tc=0; tc<t; tc++) {
			int n = sc.nextInt();
			System.out.println(d[n][0] + " " + d[n][1]);
		}
	}
}
