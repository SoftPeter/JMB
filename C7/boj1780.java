package C7;

import java.util.*;
import java.io.*;

public class boj1780 {
	static int n;
	static int[][] arr;
	static int[] cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		cnt = new int[3];
		arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt()+1;
			}
		}
		paper(0,0,n);
		for(int i=0; i<3; i++) {
			System.out.println(cnt[i]);
		}
	}
	private static void paper(int x, int y, int n) {
		if(isAble(x,y,n))
			cnt[arr[x][y]]++;
		else {
			int m = n/3;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					paper(x+m*i, y+m*j, m);
				}
			}
		}
	}
	private static boolean isAble(int x, int y, int n2) {
		for(int i=x; i<x+n2; i++) {
			for(int j=y; j<y+n2; j++) {
				if(arr[i][j] != arr[x][y])
					return false;
			}
		}
		return true;
	}
}