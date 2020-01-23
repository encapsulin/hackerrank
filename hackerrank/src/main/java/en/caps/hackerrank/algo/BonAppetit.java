package en.caps.hackerrank.algo;

import java.util.Arrays;
import java.util.List;

public class BonAppetit {

	public static void main(String[] args) {
		List<Integer> bill = Arrays.asList(2, 4, 6);
		bonAppetit(bill, 2, 3);// bonapp
		bonAppetit(bill, 2, 6);// 3

	}

	static void bonAppetit(List<Integer> bill, int k, int b) {

		int sum = 0;
		int i = 0;
		for (int billI : bill) {
			if (i++ == k)
				continue;
			sum += billI;
		}
		String r = "Bon Appetit";
		if (sum / 2 != b)
			r = Integer.toString(b - sum / 2);

		System.out.println(r);

	}
}
