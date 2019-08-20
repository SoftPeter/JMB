package C19;

import java.util.*;

public class boj10799 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Stack<Integer> stack = new Stack<>();
		int sum=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push(i);
			}
			else {
				if(i-stack.peek() == 1) {
					stack.pop();
					sum = sum + stack.size();
				}else {
					stack.pop();
					sum = sum + 1;
				}
			}
		}
		System.out.println(sum);
	}
}
