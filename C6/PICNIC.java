package C6;

import java.util.*;

public class PICNIC {
	static boolean[][] pair;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		boolean[] taken;
		while(t-- > 0) {
			int n = sc.nextInt();
			int pairN = sc.nextInt();
			taken = new boolean[n];
			pair = new boolean[10][10];
			for(int i=0; i<pairN; i++) {
				pair[sc.nextInt()][sc.nextInt()] = true;
			}
			System.out.println(countPairings(taken));
		}
	}
	private static int countPairings(boolean[] taken) {
		int firstFree = -1;
		for(int i=0; i<taken.length; i++) {
			System.out.println(taken[i] + " " + i);
			if(!taken[i]) {
				firstFree = i;
				break;
			}
		}
		
		if(firstFree == -1)	return 1;
		
		int ret=0;
		for(int pairWith = firstFree+1; pairWith<taken.length; pairWith++) {
			if(!taken[pairWith] && pair[firstFree][pairWith]) {
				System.out.println("pW : " + pairWith);
				taken[firstFree] = taken[pairWith] = true;
				ret += countPairings(taken);
				taken[firstFree] = taken[pairWith] = false;
			}
		}
		return ret;
	}
}
