package en.caps.hackerrank.algo;

import java.util.Arrays;
import java.util.LinkedList;

public class LeftRotation {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		leftRotate(arr,4);
	}

	static void leftRotate(int[] arr, int rCnt) {
		System.out.println(Arrays.toString(arr));
		int[] arrNew = new int[arr.length];
		LinkedList<Integer> ll = new LinkedList<>();
		for(int i:arr)
			ll.add(i);
		
		while(rCnt-- > 0) {
			int i = ll.removeFirst();
			ll.add(i);
		}
		
		for(int i:ll){
			System.out.print(i+" ");
		}
	}
}
