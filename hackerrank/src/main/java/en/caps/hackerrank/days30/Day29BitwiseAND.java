package en.caps.hackerrank.days30;

import java.util.Arrays;

public class Day29BitwiseAND {

	public static void main(String[] args) {
		int n = 5;
		int k = 2;
		System.out.println(doBitwise(n,k));

	}

	private static int doBitwise(int n, int k) {

		int[] set = new int[n];
		for(int i=0;i<n;i++)
			set[i] = i+1;
		System.out.println(Arrays.toString(set));
		int max = 0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++)
			{
				if(i==j)
					continue;
				int tmp = set[i]&set[j];
				if(max < tmp && tmp < k)
					max = tmp;
				//System.out.printf("\n%d & %d = %d",set[i],set[j],tmp);
			}
		}
				
		return max;
	}

}
