package C6;

import java.util.*;
import java.io.*;

public class boj4811 {
	public static long[][] map;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n != 0) {
				map = new long[31][31];
				int w = n - 1;
				int h = 1;
				System.out.println(split(w, h));
			} else
				break;
		}
	}

	private static long split(int w, int h) {
		if (w>0) {
			if(map[w][h] != 0) {
				return map[w][h];
			}
		}
		if(w==0) {
			map[w][h]=1;
			return 1;
		} else {
			long sum = 0;
			sum += split(w-1, h+1);
			System.out.println(" " +sum);
			if(h>=1) {
				sum += split(w, h-1);
				System.out.println("  " + sum);
			}
			map[w][h] = sum;
			return sum;
		}
	}
}
