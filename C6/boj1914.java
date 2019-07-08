package C6;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class boj1914 {
	static void hanoi(int n, int start, int mid, int end) {
		if(n == 1) {
			System.out.println(start + " " + end);
			return ;
		}
		
		hanoi(n-1, start, end, mid);
		System.out.println(start + " " + end);
		hanoi(n-1, mid, start, end);
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		BigInteger bi = new BigInteger("2");
		BigInteger c = bi.pow(n).subtract(BigInteger.ONE);
		System.out.println(c);
		
		if(n <= 20) {
			hanoi(n,1,2,3);
		}
	}
}
