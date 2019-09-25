package C23;

import java.util.*;

public class Boj_1927 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int input = sc.nextInt();
			if(input == 0) {
				if(minHeap.isEmpty())
					System.out.println(0);
				else
					System.out.println(minHeap.poll());
			} else {
				minHeap.add(input);
			}
		}
	}
}
