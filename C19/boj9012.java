package C19;

import java.util.*;

public class boj9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String res = "YES";
		while(n-- > 0) {
			Stack<Integer> stack = new Stack<>();
			String input = sc.next();
			for(int i=0; i<input.length(); i++) {
				if(input.charAt(i) == '(') {
					stack.push(1);
					res = "YES";
				}
				else if(input.charAt(i) == ')') {
					if(stack.isEmpty()) {
						res = "NO";
						break;
					}else
						stack.pop();
				}
			}
			
			if(!stack.isEmpty())
				res = "NO";
			System.out.println(res);
		}
	}
}
