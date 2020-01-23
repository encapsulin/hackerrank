package en.caps.hackerrank.algo;

import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(4);
//		System.out.println(al);
//		System.out.println(birthday(al, 4, 1));//2
		
		int[] ar = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(ar));
		System.out.println(divisibleSumPairs(0,5,ar));//3

	}

	//static int divisibleSumPairs(int[] ar, int k) {
	static int divisibleSumPairs(int n, int k, int[] ar) {
		int variants = 0;
		for(int i=0;i<ar.length-1;i++) {
			for(int j=i+1;j<ar.length;j++) {
				//System.out.println(ar[i]+","+ar[j]);
				if((ar[i]+ar[j])%k==0) {
					variants++;
					//System.out.println(ar[i]+ar[j]);
				}
			}
		}
		return variants;
	}
}
