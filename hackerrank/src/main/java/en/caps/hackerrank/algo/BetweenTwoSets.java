package en.caps.hackerrank.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BetweenTwoSets {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(2, 6);
		List<Integer> b = Arrays.asList(24, 36);
		System.out.println(getTotalX(a, b));// 2:6,12

		// System.out.println(getTotalX(Arrays.asList(4, 2), Arrays.asList(32, 16,
		// 96)));// 3:4,8,16
		System.out.println(getTotalX(Arrays.asList(2, 1), Arrays.asList(16, 2, 96)));// 3:4,8,16

		// System.out.println(getTotalX(Arrays.asList(3, 4), Arrays.asList(24, 48)));//
		// 2
		// System.out.println(getTotalX(Arrays.asList(4, 3), Arrays.asList(48, 24)));//
		// 2
	}

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		System.out.print("getTotalX ");
		System.out.print(a);
		System.out.println(b);
		int r = 0;

		int iMinB = 0;
		for (int i : b) {
			if (iMinB == 0 || iMinB > i)
				iMinB = i;
		}

		List<Integer> aFactors = new ArrayList<>();
		int l = 1;
		int firstA = a.get(0);
		for (int i = 1; l <= iMinB; i++) {
			l = (int) (i * firstA);
			if (l <= iMinB)
				aFactors.add(l);
		}
		System.out.println("aFactors:" + aFactors);
		
		for (int iA : a) {
			for (Iterator<Integer> itr = aFactors.iterator(); itr.hasNext();) {
				int x = itr.next();
				if (x < iA || x % iA > 0)
					itr.remove();
			}
		}
		System.out.println("aFactors:" + aFactors);

		for (int iB : b) {
			for (Iterator<Integer> itr = aFactors.iterator(); itr.hasNext();) {
				int x = itr.next();
				if (iB % x> 0)
					itr.remove();
			}
		}
		System.out.println("aFactors:" + aFactors);
		return aFactors.size();
	}

	public static int getTotalX1(List<Integer> a, List<Integer> b) {
		System.out.print("getTotalX ");
		System.out.print(a);
		System.out.println(b);
		int r = 0;

		int iMaxA = a.stream().mapToInt(v -> v).max().orElse(0);
		int iMinA = 0;// a.stream().mapToInt(v -> v).min().orElse(0);
		for (int i : a) {
			if (iMinA == 0 || iMinA > i)
				iMinA = i;
		}
		int iMinB = b.get(0);
		// iMinB = b.stream().mapToInt(v -> v).min().orElse(0);
		for (int i : b) {
			if (i != 0 && (iMinB == 0 || iMinB > i))
				iMinB = i;
		}
		List<Integer> aFactors = new ArrayList<>();

		long l = iMaxA;
		;
		int i = 1;
		while (l < iMinB) {
			l = iMaxA * i;
			if (l % iMinA == 0)
				aFactors.add((int) l);
			i++;
		}

		System.out.println("aFactors:" + aFactors);

		for (int iA : aFactors) {
			boolean bValid = true;
			MAIN: for (int iB : b) {
				if (iB > 0 && iB % iA != 0) {
					bValid = false;
					break MAIN;
				}

			}
			if (bValid)
				r++;
		}

		return r;
	}

}
