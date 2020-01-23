package en.caps.hackerrank.algo.days30;

public class Day9Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(3));
	}

	static int factorial(int n) {
		if (n < 1)
			return 1;
		else
			return n * factorial(n - 1);

	}

}
