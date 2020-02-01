package en.caps.hackerrank.algo;

import java.util.Arrays;

public class HurdleRace {

	public static void main(String[] args) {
		int[] height = { 1, 2, 3, 3, 2 };
		System.out.println(hurdleRace(1, height));

		int[] height2 = { 1, 6, 3, 5, 2 };
		System.out.println(hurdleRace(4, height2));		
	}

	static int hurdleRace(int k, int[] height) {
		Arrays.sort(height);
		int max = height[height.length-1];
		max -= k;
		if(max<0)
			max = 0;
		return max;
	}
}
