package C23;

import java.util.*;

public class Boj_11279 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int input = sc.nextInt();
			if(input == 0) {
				if(maxHeap.isEmpty())
					System.out.println(0);
				else
					System.out.println(maxHeap.poll());
			} else {
				maxHeap.add(input);
			}
		}
	}
}
