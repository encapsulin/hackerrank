package en.caps.hackerrank.algo;

public class CatsMouse {

	public static void main(String[] args) {
		System.out.println(catAndMouse(1, 2, 3));// Cat B
		System.out.println(catAndMouse(1, 3, 2));// Mouse C
	}

	static String catAndMouse(int x, int y, int z) {
		int diffA = Math.abs(x - z);
		int diffB = Math.abs(y - z);
		if (diffA < diffB)
			return ("Cat A");
		else if (diffA > diffB)
			return ("Cat B");
		else
			return ("Mouse C");
	}
}
