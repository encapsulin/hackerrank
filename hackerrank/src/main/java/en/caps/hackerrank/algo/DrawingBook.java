package en.caps.hackerrank.algo;

public class DrawingBook {

	public static void main(String[] args) {
		System.out.println(pageCount(6, 2));// 1
		System.out.println(pageCount(5, 4));// 0
	}

	static int pageCount(int n, int p) {
		int flips = 0;
		flips = p / 2;
		if (p > n / 2)
			flips = n / 2 - flips;
		return flips;
	}

}
