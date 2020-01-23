package en.caps.hackerrank.algo;

import java.util.Arrays;
import java.util.List;

public class BreakingRecords {

	public static void main(String[] args) {

		int[] arr2 = { 0, 1 };
		System.out.println(Arrays.toString(breakingRecords(arr2)));

		int[] arr = { 10, 5, 20, 20, 4, 5, 2, 25, 1 };// 2 4
		System.out.println(Arrays.toString(breakingRecords(arr)));

		int[] arr1 = { 3, 4, 21, 36, 10, 28, 35, 5, 24, 42 };// 4 0
		System.out.println(Arrays.toString(breakingRecords(arr1)));

	}

	static int[] breakingRecords(int[] scores) {
//		List <Integer> lGames = new ArrayList<>();
//		List<Integer> lGames = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
//		System.out.println(Arrays.toString(scores));
		int min = 0, max = 0;
		int breakMin = 0, breakMax = 0;
		int i=0;
		for (int iVal : scores) {
			if (i++ == 0) {
				min = iVal;
				max = iVal;
			}
			if (iVal < min) {
				breakMin++;
				min = iVal;
			}
			if (iVal > max) {
				breakMax++;
				max = iVal;
			}
		}
		int[] r = { breakMax, breakMin };
		return r;
	}
}
