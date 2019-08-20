package C19;

import java.util.*;

public class BRACKETS2 {
	static Stack<Character> stack;
	static String line;
	
	public static String brackets(String line) {
		for(int i=0; i<line.length(); i++) {
			char c = line.charAt(i);
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
			}else if(c == ')') {
				if(stack.size()==0 || stack.pop()!='(') return "NO";
			}else if(c == '}') {
				if(stack.size()==0 || stack.pop()!='{') return "NO";
			}else if(c == ']') {
				if(stack.size()==0 || stack.pop()!='[') return "NO";
			}
		}
		
		if(stack.size() != 0) return "NO";
		return "YES";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- > 0) {
			line = sc.next();
			stack = new Stack<>();
			String result = brackets(line);
			System.out.println(result);
		}
	}
}