package en.caps.hackerrank.algo;

import java.util.Arrays;

public class MinMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 5, 6, 7, 3 };
		miniMaxSum(arr);
	}

	static void miniMaxSum(int[] arr) {

		Arrays.sort(arr);

		Long iMin=0L;
		long iMax=0;

		for (int i=0;i< arr.length;i++) {
			//System.out.println(i);
			if(i>0)
				iMax+=arr[i];
			if(i<arr.length-1)
				iMin += arr[i];
		}
		
		System.out.printf("%d %d",iMin,iMax);
				
	}

}
