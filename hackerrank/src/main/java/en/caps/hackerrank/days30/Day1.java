package en.caps.hackerrank.days30;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int i2 = 4;
		double d2 = 4.0;
		String s2 = "HackerRank ";

		i2 = scan.nextInt();
		d2 = scan.nextDouble();
		s2 = scan.next();
		s2 += scan.nextLine();

		System.out.println(i + i2);
		System.out.println(d + d2);
		System.out.println(s + s2);

		scan.close();
	}

}
