package C6;

import java.util.*;

public class CLOCKSYNC {
	private static final int CNT_CLOCK = 16, CNT_BUTTON = 10, MIN = 9999;
	private static int[][] button_clock = {
	{1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	{0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0},
	{0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1},
	{1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
	{0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0},
	{1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
	{0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
	{0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1},
	{0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	{0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0}
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] clockArray = new int[CNT_CLOCK];
		int[] result = new int[t];
		int tmp;
		
		while(t-- > 0) {
			for(int i=0; i<CNT_CLOCK; i++) {
				clockArray[i] = sc.nextInt();
			}
			
			tmp = solve(clockArray, 0);
			result[t] = tmp >= MIN ? -1:tmp;
		}
		for(int i=result.length-1; i>=0; i--) {
			System.out.println(result[i]);
		}
	}

	private static int solve(int[] clockArray, int button) {
		if(button == CNT_BUTTON) {
			return isAllClock12(clockArray)? 0:MIN;
		}
		int min = MIN;
		
		for(int times=0; times<4; times++) {
			min = Math.min(min, times+solve(clockArray, button+1));
			clickButton(clockArray, button);
		}
		return min;
	}

	private static void clickButton(int[] clockArray, int button) {
		for(int i=0; i<CNT_CLOCK; i++) {
			if(button_clock[button][i]==1) {
				clockArray[i] += 3;
				if(clockArray[i] == 15) {
					clockArray[i] = 3;
				}
			}
		}
		
	}

	private static boolean isAllClock12(int[] clockArray) {
		for(int i=0; i<CNT_CLOCK; i++) {
			if(clockArray[i] != 12) {
				return false;
				}
		}
		return true;
	}
}