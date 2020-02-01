package en.caps.hackerrank.algo;

public class UtopianTree {

	public static void main(String[] args) {
		System.out.println(utopianTree(0));// 1
		System.out.println(utopianTree(1));// 2
		System.out.println(utopianTree(4));// 7
	}

	static int utopianTree(int n) {
		int N = 0;
		int h = 1;
		while (N < n) {
			if (N % 2 != 0)
				h += 1;
			else
				h *= 2;
			N++;
		}
		return h;
	}
}
