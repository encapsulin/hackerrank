package en.caps.hackerrank.algo;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ClimbingLeaderboard {

	public static void main(String[] args) {
		int[] scores = { 100, 100, 50, 40, 40, 20, 10 };
		int[] alice = { 5, 25, 50, 120 };
		int[] r = climbingLeaderboard(scores, alice);
		// [6, 4, 2, 1]
		System.out.println(Arrays.toString(r));

		int[] scores1 = { 100, 90, 90, 80, 75, 60 };
		int[] alice1 = { 50, 65, 77, 90, 102 };
		int[] r2 = climbingLeaderboard(scores1, alice1);
		//6		5		4		2		1
		System.out.println(Arrays.toString(r2));

		List<Integer> al = new ArrayList<>();
		int i = 1000000;
		Random r1 = new Random();
		while (i-- > 0) {
			int iR = Math.abs(r1.nextInt(1000));
			al.add(iR);
		}
		// System.out.println(al.toString());
//		
		int[] scores2 = al.stream().mapToInt(in -> in).toArray();
		al.clear();
//		List<Integer> al2 = new ArrayList<>();
		i = 100000;
		while (i-- > 0) {
			int iR = Math.abs(r1.nextInt(1000));
			al.add(iR);
		}

		int[] alice2 = al.stream().mapToInt(in -> in).toArray();

		ZonedDateTime lt = ZonedDateTime.now();
		r2 = climbingLeaderboard(scores2, alice2);
		ZonedDateTime lt2 = ZonedDateTime.now();

		System.out.println(Arrays.toString(r2));

		long lDiff = lt2.toInstant().toEpochMilli() - lt.toInstant().toEpochMilli();
		System.out.printf("done in %d ms", lDiff);
	}

	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		//TreeSet<Integer> aSet = new TreeSet<>(Collections.reverseOrder());
		TreeSet<Integer> aSet = new TreeSet<>();
		for (int i : scores) {
			aSet.add(i);
		}
		ArrayList<Integer> al = new ArrayList<>(aSet);
//		System.out.println(al);
//		System.out.println(Arrays.toString(alice));
		List<Integer> alPlaces = new ArrayList<>();
		
		for (Integer asdf : alice) {
			int iPos = Collections.binarySearch(al, asdf);
			if(iPos<0)
				iPos = al.size()+iPos+2;
			else iPos = al.size() - iPos;
			alPlaces.add(iPos);
		}
		return alPlaces.stream().mapToInt(i -> i).toArray();
	}

	static int[] climbingLeaderboard2(int[] scores, int[] alice) {
		Set<Integer> aSet = new TreeSet<>(Collections.reverseOrder());
		for (int i : scores) {
			aSet.add(i);
		}

//		System.out.println(aSet);
		List<Integer> alPlaces = new ArrayList<>();
		for (int iAlice_i : alice) {
			int iPlace = 1;
			int i = 1;
			for (int aSet_i : aSet) {
				if (iAlice_i >= aSet_i) {
					iPlace = i;
					break;
				} else
					iPlace = i + 1;
				i++;
			}
			alPlaces.add(iPlace);
			// aSet.add(iAlice_i);
		}
//		System.out.println(aSet);
//		System.out.println(alPlaces);
//		return new int[] { 1 };

		return alPlaces.stream().mapToInt(i -> i).toArray();
	}

}
