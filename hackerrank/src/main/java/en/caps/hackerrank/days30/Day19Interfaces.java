package en.caps.hackerrank.days30;

public class Day19Interfaces {

	public static void main(String[] args) {
		AdvancedArithmetic myCalculator = new Calculator1();
		int sum = myCalculator.divisorSum(6);
		System.out.println(sum);
	}

	
}

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculator1 implements AdvancedArithmetic {
	public int divisorSum(int n) {
		int nN = n;
		int sum = 0;
		while (nN > 0) {
			if (n % nN == 0) {
				System.out.println(nN);
				sum += nN;
			}
			nN--;
		}
		return sum;
	}
}