package en.caps.hackerrank.algo;

import java.util.ArrayList;
import java.util.Arrays;

public class SparseArrays {

	public static void main(String[] args) {
		String[] strings = {"aba","baba","aba","xzxb"};
		String[] queries = {"aba","xzxb","ab"};
		int[] res = matchingStrings(strings, queries);
		System.out.println(Arrays.toString(res));
	}

	private static int[] matchingStrings(String[] strings, String[] queries) {
		System.out.println(Arrays.toString(strings));
		System.out.println(Arrays.toString(queries));
		//ArrayList<Integer> al = new ArrayList<>();
		int[] r = new int[queries.length];
		int i = 0;
		for(String s_query:queries) {
			int cnt = 0;
			for(String s_str:strings)
				if(s_str.equals(s_query))
					cnt++;
			r[i++] = cnt;
		}
		return r;
	}
}
