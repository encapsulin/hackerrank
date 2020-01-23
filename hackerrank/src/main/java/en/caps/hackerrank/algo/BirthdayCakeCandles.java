package en.caps.hackerrank.algo;

import java.util.Arrays;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		int[] ar = { 4,3,4,5,6}; 
		birthdayCakeCandles(ar);

	}

	static int birthdayCakeCandles(int[] ar) {
		Arrays.sort(ar);
		int iLen = ar.length;
		int max = ar[iLen-1];
		long sum = 0;
		for(int i:ar){
			if(i==max)
				sum++;
		}
		return (int)sum;

    }
}
