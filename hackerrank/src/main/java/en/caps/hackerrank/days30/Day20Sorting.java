package en.caps.hackerrank.days30;

import java.util.Arrays;

public class Day20Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 3, 2, 1 };
		int swaps = sort(ar);
		System.out.println(Arrays.toString(ar));
		System.out.printf("Array is sorted in %d swaps.\n",swaps);
		System.out.println("First Element: "+ar[0]);
		System.out.println("Last Element: "+ ar[ar.length -1]);
	}

	static void swap(int[] ar, int a0, int a2) {
		int tmp = ar[a0];
		ar[a0] = ar[a2];
		ar[a2] = tmp;
	}

	static int sort(int[] a) {
		int n = a.length;
		int numberOfSwaps = 0;
		
		for (int i = 0; i < n; i++) {
		    // Track number of elements swapped during a single array traversal
		    
		    
		    for (int j = 0; j < n - 1; j++) {
		        // Swap adjacent elements if they are in decreasing order
		        if (a[j] > a[j + 1]) {
		            swap(a,j, j + 1);
		            numberOfSwaps++;
		        }
		    }
		    
		    // If no elements were swapped during a traversal, array is sorted
		    if (numberOfSwaps == 0) {
		        break;
		    }
		}
		return numberOfSwaps;
	}
}
