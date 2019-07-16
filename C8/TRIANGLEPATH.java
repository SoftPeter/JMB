package C8;

import java.util.*;
import java.io.*;

public class TRIANGLEPATH {
	static int n;
	static int[][] triangle = new int[100][100];
	static int[][] tmp = new int[100][100];
	
	static int path(int y, int x) {
		if(y==n-1)	return triangle[y][x];
		if(tmp[y][x] != -1)
			return tmp[y][x];
		return tmp[y][x] = Math.max(path(y+1,x), path(y+1,x+1)) + triangle[y][x];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = Integer.parseInt(sc.next());
		for(int tc=0; tc<C; tc++) {
			n = Integer.parseInt(sc.next());
			for(int i=0; i<n; i++) {
				Arrays.fill(tmp[i], -1);
				for(int j=0; j<=i; j++) {
					triangle[i][j] = Integer.parseInt(sc.next());
				}
			}
			System.out.println(path(0,0));
		}
	}
}