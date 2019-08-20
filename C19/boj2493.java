package C19;

import java.util.*;
import java.io.*;


public class boj2493 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> rootstack = new Stack<>();
		Stack<Integer> numstack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int first = Integer.parseInt(st.nextToken());
		//int first = sc.nextInt();
		//System.out.println(first);
		rootstack.push(first);
		numstack.push(1);
		//System.out.print(0 + " ");
		sb.append("0 ");
		for(int i=2; i<=n; i++) {
			//int v = sc.nextInt();
			int v = Integer.parseInt(st.nextToken());
			while(!rootstack.isEmpty()) {
				if(rootstack.peek() > v) {
					//System.out.print(numstack.peek() + " ");
					sb.append(numstack.peek() + " ");
					break;
				}
				rootstack.pop();
				numstack.pop();
			}
			if(rootstack.isEmpty())
				//System.out.print(0 + " ");
				sb.append("0 ");
			rootstack.push(v);
			numstack.push(i);
		}
		System.out.println(sb.toString());
	}
}