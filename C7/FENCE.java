package C7;

import java.util.*;
import java.io.*;

public class FENCE {
	static int n;
	static int[] h;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			n = Integer.parseInt(br.readLine());
			h = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<h.length; i++) {
				h[i] = Integer.parseInt(st.nextToken());
			}
			int result = solve(0, n-1);
			System.out.println(result);
		}
	}
	private static int solve(int left, int right) {
		if(left == right)
			return h[left];
		int mid = (left + right)/2;
		int ret = Math.max(solve(left, mid), solve(mid+1, right));
		
		int lo = mid;
		int hi = mid+1;
		int height = Math.min(h[lo], h[hi]);
		ret = Math.max(ret, height*2);
		
		while(left < lo || hi < right) {
			if(hi < right && (lo == left || h[lo-1] < h[hi+1])) {
				hi++;
				height = Math.min(height, h[hi]);
			} else {
				lo--;
				height = Math.min(height, h[lo]);
			}
			
			ret = Math.max(ret, height*(hi-lo+1));
		}
		return ret;
	}
}