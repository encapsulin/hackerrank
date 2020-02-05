package en.caps.hackerrank.algo;

import java.util.Arrays;
import java.util.Random;

public class ArrayManipulation {

	public static void main1(String[] args) {
//		int n = 10;
//		int[][] queries = { { 1, 5, 3 }, { 4, 8, 7 }, { 6, 9, 1 } };
//		System.out.println("queries:" + Arrays.deepToString(queries));
		
//		int n = 5;
//		int[][] queries = { { 1, 2, 100 }, { 2, 5, 100 }, { 3, 4, 100 } };

		int n = 100000;
		int queriesCnt = 100000;
		int[][] queries = new int[queriesCnt][3];
		Random rnd = new Random();
		for (int i = 0; i < queriesCnt; i++) {
			int r1 = rnd.nextInt(n);
			if (r1 == 0)
				r1 = 1;
			int r2 = r1 + rnd.nextInt(n - r1);
			queries[i][0] = r1;
			queries[i][1] = r2;
			queries[i][2] = rnd.nextInt(1000);
		}


		long l1 = System.currentTimeMillis();
		long l = arrayManipulation(n, queries);
		long l2 = System.currentTimeMillis();
		System.out.println("l:" + l);
		System.out.println("total time:" + (l2 - l1));
	}

	public static void main(String[] args) {
		int n = 10;
		int[][] queries = { { 1, 5, 3 }, { 4, 8, 7 }, { 6, 9, 1 } };
		System.out.println("queries:" + Arrays.deepToString(queries));
		
		
		long l1 = System.currentTimeMillis();
		long l = arrayManipulation(n, queries);
		long l2 = System.currentTimeMillis();
		System.out.println("l:" + l);
		System.out.println("total time:" + (l2 - l1));
	}

	static long arrayManipulation(int n, int[][] queries) {
		
		long[] arr = new long[n];
		long l1 = System.currentTimeMillis();
		Arrays.fill(arr, 0);
		long l2 = System.currentTimeMillis();
		//System.out.println("fill time:" + (l2 - l1));
		
		l1 = System.currentTimeMillis();
		for (int[] queries_i : queries) {
			int a = queries_i[0] - 1;
			int b = queries_i[1] - 1;
			int k = queries_i[2];

			arr[a] += k;
			if(b+1<n)
				arr[b+1] -= k;
		}		
		System.out.println(Arrays.toString(arr));
		
		long tmp = 0;
		long max = 0;
		for(int i=0;i<n;i++) {
			tmp += arr[i];
			if(max<tmp)
				max=tmp;
		}
		
		l2 = System.currentTimeMillis();
		//System.out.println("calc time:" + (l2 - l1));

		return max;
	}

	static long arrayManipulation1(int n, int[][] queries) {

		long[] arr = new long[n];
		Arrays.fill(arr, 0);

		for (int[] queries_i : queries) {
			int a = queries_i[0] - 1;
			int b = queries_i[1] - 1;
			int k = queries_i[2];
			for (int i = a; i <= b; i++) {
				arr[i] += k;
			}
		}

//		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);

		return arr[arr.length - 1];
	}
}
