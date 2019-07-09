package C7;

import java.util.*;
import java.io.*;

public class QUADTREE {
	static String str;
	static int idx;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			str = br.readLine().trim();
			
			idx = 0;
			String result = recursive();
			System.out.println(result);
		}
	}
	private static String recursive() {
		char c = str.charAt(idx);
		if(c != 'x')
			return c+"";
		
		idx++;
		String str1 = recursive();
		
		idx++;
		String str2 = recursive();
		
		idx++;
		String str3 = recursive();
		
		idx++;
		String str4 = recursive();
		
		return "x" + str3 + str4 + str1 + str2;
	}
}
