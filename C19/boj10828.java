package C19;

import java.util.*;

public class boj10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		while(n-- > 0) {
			String input = sc.next();
			if(input.contains("push")) {
				int input2 = sc.nextInt();
				stack.push(input2);
			}else if(input.equals("pop")) {
				if(stack.isEmpty())
					System.out.println(-1);
				else
					System.out.println(stack.pop());
			}else if(input.equals("size")) {
				System.out.println(stack.size());
			}else if(input.equals("empty")) {
				if(stack.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}else if(input.equals("top")) {
				if(stack.isEmpty())
					System.out.println(-1);
				else
					System.out.println(stack.peek());
			}
		}
	}
}
