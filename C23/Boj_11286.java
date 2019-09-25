package C23;

import java.util.*;

public class Boj_11286 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Integer> q1 = new PriorityQueue<>();
		PriorityQueue<Integer> q2 = new PriorityQueue<>();
		
		for(int i=0; i<n; i++) {
			int m = sc.nextInt();
			
			if(m > 0)
				q1.add(m);
			else if(m < 0)
				q2.add(m * -1);
			else {
				int que1 = 100001;
				int que2 = 100001;
				if(!q1.isEmpty())	que1 = q1.peek();
				if(!q2.isEmpty())	que2 = q2.peek();
				if(que1==100001 && que2==100001) {
					System.out.println(0);
					continue;
				}
				else if(que1 < que2) {
					q1.poll();
					System.out.println(que1);
				}
				else {
					q2.poll();
					System.out.println(que2*-1);
				}
			}
		}
	}
}
