package en.caps.hackerrank.algo;

public class AngryProfessor {

	public static void main(String[] args) {
		System.out.println(angryProfessor(3, new int[] { -1, -3, 4, 2 }));
		// YES
		System.out.println(angryProfessor(2, new int[] { 0, -1, 2, 1 }));
		// NO
	}

	static String angryProfessor(int k, int[] a) {
		int cnt = 0;
		for (int i : a)
			if (i <= 0)
				cnt++;
		return (cnt < k) ? "YES" : "NO";

	}
}
