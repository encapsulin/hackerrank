package en.caps.hackerrank.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> al = new ArrayList<>();
		al.add(Arrays.asList(1, 0, 5));
		al.add(Arrays.asList(1, 1, 7));
		al.add(Arrays.asList(1, 0, 3));
		al.add(Arrays.asList(2, 1, 0));
		al.add(Arrays.asList(2, 1, 1));
		dynamicArray(2, al);
	}

	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		List<Integer> alLastAnswer = new ArrayList<>();
		int lastAnswer = 0;

		List<List<Integer>> subQues = new ArrayList<List<Integer>>();
		int N = n;
		while (n-- > 0)
			subQues.add(new ArrayList<Integer>());
//		System.out.println(subQues.toString());

//		System.out.println(queries.toString());
		for (List<Integer> queries_i : queries) {
//			System.out.println(queries_i.toString());

			int iQueryType = queries_i.get(0);
			int iQueryX = queries_i.get(1);
			int iQueryY = queries_i.get(2);
			int index = (iQueryX ^ lastAnswer) % N;
			List<Integer> seq = subQues.get(index);
			if (iQueryType == 1) {								
				seq.add(iQueryY);
			} else if (iQueryType == 2) {				
				lastAnswer = seq.get(iQueryY % seq.size());
				System.out.println(lastAnswer);
				alLastAnswer.add(lastAnswer);
			}

		}
		return alLastAnswer;
	}
}
