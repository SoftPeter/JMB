package C23;

import java.util.*;

public class Boj_1766 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int indegree[] = new int[n+1];
		ArrayList<Integer>[] list = new ArrayList[n+1];
		for(int i=1; i<=n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b);
			indegree[b]++;
		}
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i=1; i<=n; i++) {
			if(indegree[i] == 0)
				q.add(i);
		}
		
		while(!q.isEmpty()) {
			int current = q.poll();
			System.out.print(current + " ");
			for(int i=0; i<list[current].size(); i++) {
				int next = list[current].get(i);
				indegree[next]--;
				if(indegree[next]==0)
					q.add(next);
			}
		}
	}
}
