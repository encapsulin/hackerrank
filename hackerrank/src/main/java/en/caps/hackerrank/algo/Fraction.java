package en.caps.hackerrank.algo;

public class Fraction {

	public static void main(String[] args) {
		double a= 4;
		System.out.print(a);
		int[] arr = { -4, 3, -9, 0, 4, 1 };
		plusMinus(arr);

	}

	static void plusMinus(int[] arr) {

		int iPos = 0;
		int iZer = 0;
		int iNeg = 0;
		for (int i : arr)
			if (i < 0)
				iNeg++;
			else if (i == 0)
				iZer++;
			else if (i > 0)
				iPos++;
		
		//System.out.printf("%d %d %d%n",iPos,iNeg,iZer);
		
		double fPos = 0.0;		
		fPos = (double)iPos / arr.length;
		System.out.printf("%3.6f%n",fPos);

		double fNeg = 0.0;		
		fNeg = (double)iNeg / arr.length;
		System.out.printf("%3.6f%n",fNeg);
		
		double fZer = 0.0;		
		fZer = (double)iZer / arr.length;
		System.out.printf("%3.6f%n",fZer);
	}

}
