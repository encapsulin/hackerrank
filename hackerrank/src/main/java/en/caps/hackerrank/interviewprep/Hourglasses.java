package en.caps.hackerrank.interviewprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hourglasses {

	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		System.out.println(hourglassSum(arr));
	}

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		List<Integer> cnt = new ArrayList<>();
		for (int ir = 0; ir <= 3; ir++) {

			for (int ic = 0; ic <= 3; ic++) {
				int cnt_i = 0;
				cnt_i += arr[ir][ic] + arr[ir][ic + 1] + arr[ir][ic + 2];
				cnt_i += arr[ir + 1][ic + 1];
				cnt_i += arr[ir + 2][ic] + arr[ir + 2][ic + 1] + arr[ir + 2][ic + 2];
				//System.out.println(cnt_i);
				cnt.add(cnt_i);
			}

		}
		Collections.sort(cnt);
		return cnt.get(cnt.size() - 1);
	}
}
