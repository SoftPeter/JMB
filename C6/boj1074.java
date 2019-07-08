package C6;

import java.util.*;
import java.io.*;

public class boj1074 {
	static int stoi(String s) {
		return Integer.parseInt(s);
	}
	static int N;
	static int r, c;
	static int count = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = stoi(st.nextToken());
		r = stoi(st.nextToken());
		c = stoi(st.nextToken());
		
		serch(0,0,getSize(N));
	}
	
	private static void serch(int x, int y, int size) {
		if(size == 1) {
			if(x == r && y == c) {
				System.out.println(count);
			}
			count++;
			return;
		}
		
		int s = size/2;
		
		serch(x,y,s);
		serch(x,y+s,s);
		serch(x+s,y,s);
		serch(x+s,y+s,s);
	}
	
	private static int getSize(int n) {
		int result = 1;
		for(int i=0; i<n; i++) {
			result *= 2;
		}
		return result;
	}
}
