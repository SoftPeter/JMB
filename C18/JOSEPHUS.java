package C18;

import java.util.*;

public class JOSEPHUS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=0; t<tc; t++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			LinkedList<Integer> q = new LinkedList<>();
			
			for(int i=1; i<=n; i++)
				q.add(i);
			
			int dir = 0;
			q.remove(dir);
			
			while(true) {
				if(q.size()<=2)
					break;
				dir = dir+k-1;
				while(dir >= q.size())
					dir = dir-q.size();
				q.remove(dir);
			}
			System.out.println(q.get(0) + " " + q.get(1));	
		}
	}
}
