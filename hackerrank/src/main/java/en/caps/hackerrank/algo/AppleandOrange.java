package en.caps.hackerrank.algo;

public class AppleandOrange {

	public static void main(String[] args) {
//		7 11
//		5 15
//		3 2
//		-2 2 1
//		5 -6
		int s = 7, t = 11;
		int a = 5, b = 15;
		int[] apples = { -2, 2, 1 };
		int[] oranges = { 5, -6 };
		countApplesAndOranges(s, t, a, b, apples, oranges);
	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		long iApple = 0;
		for(int i:apples)
			if(a+i >= s && a+i<=t)
				iApple++;
	
		long iOrange = 0;
		for(int i:oranges)
			if(b+i >= s && b+i<=t)
				iOrange++;

		System.out.println(iApple);
        System.out.println(iOrange);
	}
}
