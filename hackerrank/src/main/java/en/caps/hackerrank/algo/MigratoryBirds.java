package en.caps.hackerrank.algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1, 1, 2, 2, 3);// 1
		System.out.println(migratoryBirds(arr));
	}

	static int migratoryBirds(List<Integer> arr) {
		int r = 0;
		Map<Integer, Integer> sum = new HashMap<>();
		for (int v : arr) {
			Integer val = sum.get(v);
			if (val == null)
				val = 1;
			else
				val++;
			sum.put(v, val);
		}
		//System.out.println(sum);

		int maxCnt = -1;
		for (Integer keyNum : sum.keySet()) {
			Integer valCnt = sum.get(keyNum);
			if (maxCnt < 0 || maxCnt < valCnt)
				maxCnt = valCnt;
		}
		//System.out.println("maxCnt:" + maxCnt);

		int min = -1;
		for (Integer keyNum : sum.keySet()) {
			Integer valCnt = sum.get(keyNum);
			if ((min < 0 || min > keyNum) && maxCnt == valCnt)
				min = keyNum;
		}
		//System.out.println(min);

		return min;
	}

}
