package C8;

import java.util.*;
import java.io.*;

public class JUMPGAME {
	static int n;
	static int[][] board = new int[100][100];
	static int[][] tmp = new int[100][100];
	static int ret = 0;
	static int jump(int y, int x) {
		if(y>=n || x>=n)	return 0;
		if(y==n-1 && x==n-1)	return 1;
		//ret = tmp[y][x];
		//if(ret != -1)	return ret;
		if(tmp[y][x] != -1)
			return tmp[y][x];
		int jumpSize = board[y][x];
		return tmp[y][x] = (jump(y+jumpSize, x) | jump(y, x+jumpSize));
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.next());
		//sc.nextLine();
		for(int t=0; t<tc; t++) {
			n = Integer.parseInt(sc.next());
			for(int i=0; i<n; i++) {
				Arrays.fill(tmp[i], -1);
				for(int j=0; j<n; j++) {
					board[i][j] = Integer.parseInt(sc.next());
				}
			}
			System.out.println(jump(0,0)!=0 ? "YES" : "NO");
		}
		sc.close();
	}
}
