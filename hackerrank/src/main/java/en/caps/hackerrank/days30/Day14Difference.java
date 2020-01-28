package en.caps.hackerrank.days30;

import java.util.Arrays;

public class Day14Difference {

	public static void main(String[] args) {
		
		int[] arr = {1,2,5};
		Difference d = new Difference(arr);
		System.out.println(d.computeDifference());
	}

}



class Difference {
  	private int[] elements;
  	public int maximumDifference;

	public Difference(int[] elems){
        elements = elems;
    }

    public int computeDifference(){
        Arrays.sort(elements);
        return Math.abs(elements[0]-elements[elements.length-1]);
    }

}