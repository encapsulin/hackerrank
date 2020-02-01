package en.caps.hackerrank.algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PickingNumbers {

	public static void main(String[] args) {
		System.out.println(pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2)));
		System.out.println(pickingNumbers(Arrays.asList(2, 1, 2, 4, 1, 4, 5, 5, 5)));		
		System.out.println(pickingNumbers(Arrays.asList(3, 3, 4, 4, 9, 9, 9, 9, 9, 14, 14, 14)));
		System.out.println(pickingNumbers(Arrays.asList(32, 14)));
	}

	public static int pickingNumbers(List<Integer> a) {
		Collections.sort(a);
		System.out.println(a);
		
		Map<Integer, Integer> aMap = new HashMap<>();
		for (int i : a) {
			Integer im = aMap.get(i);
			int cnt = (im == null) ? 1 : im + 1;
			aMap.put(i, cnt);
		}
					
		int maxLen = 0;
		int iPrevKey = 0;
		int iPrevVal = 0;
		Object[] keySet = aMap.keySet().toArray();
		Arrays.sort(keySet);
		for (Object mapKeyObj:keySet) {
			int mapKey = (int)mapKeyObj;
			Integer mapVal = aMap.get(mapKey);
			System.out.printf("%d => %d %n", mapKey,mapVal);
			if (iPrevKey == 0 || maxLen < mapVal)
				maxLen = mapVal;
			if (maxLen < mapVal + iPrevVal && (mapKey - iPrevKey <= 1))
				maxLen = iPrevVal + mapVal;
			iPrevKey = mapKey;
			iPrevVal = mapVal;
		}
		return maxLen;
	}

}
