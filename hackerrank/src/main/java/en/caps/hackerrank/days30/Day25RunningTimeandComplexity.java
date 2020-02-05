package en.caps.hackerrank.days30;

import java.util.Scanner;

public class Day25RunningTimeandComplexity {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        while(cnt-->0) {
        	long n = scan.nextLong();
        	System.out.println(isNatural(n));
        }
        

	}

	private static String isNatural(long n) {
		if(n<=1)
			return "Not prime";
		
		for(long i=2;i<=Math.sqrt(n);i++) {
			if(n % i == 0) {
				return "Not prime";
			}
		}
		return "Prime";
	}
}