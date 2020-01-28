package en.caps.hackerrank.java;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String s = scanner.nextLine();
		BigInteger bi = new BigInteger(s);
		String r = "prime";
		if (!bi.isProbablePrime(1))
			r = "not " + r;
		System.out.println(r);

		scanner.close();
	}

}
