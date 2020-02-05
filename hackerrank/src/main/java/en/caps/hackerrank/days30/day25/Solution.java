package en.caps.hackerrank.days30.day25;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		System.out.println(isNatural(0));
		System.out.println(isNatural(1));
		System.out.println(isNatural(12));
		System.out.println(isNatural(5));
		System.out.println(isNatural(7));
		System.out.println(isNatural(2));
		
//		Scanner scan = new Scanner(System.in);
//		int iCnt = scan.nextInt();
//		int iNum = 0;
//		while (iCnt-- > 0) {
//			iNum = scan.nextInt();
//			System.out.println(isNatural(iNum));
//		}

	}

	static String isNatural(int n) {
		if(n<=1)
			return "Not prime";
		
		for(int i=2;i<=Math.sqrt(n); i++ ) {
			if(n % i == 0) {
				return "Not prime";
			}
		}
		return "Prime";
	}
}