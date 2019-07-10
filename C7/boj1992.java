package C7;

import java.util.*;
import java.io.*;

public class boj1992 {
	static char[][] quadtree;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		quadtree = new char[n][n];
		for(int i=0; i<n; i++) {
			quadtree[i] = sc.next().toCharArray();
		}
		solve(0,0,n);
	}
	private static void solve(int x, int y, int n) {
		if(same(x,y,n))
			System.out.print(quadtree[x][y]);
		else {
			System.out.print("(");
			int m = n/2;
			for(int i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					solve(x+m*i, y+m*j, m);
				}
			}
			System.out.print(")");
		}
	}
	private static boolean same(int x, int y, int n) {
		for(int i=x; i<x+n; i++) {
			for(int j=y; j<y+n; j++) {
				if(quadtree[i][j] != quadtree[x][y])
					return false;
			}
		}
		return true;
	}
}
