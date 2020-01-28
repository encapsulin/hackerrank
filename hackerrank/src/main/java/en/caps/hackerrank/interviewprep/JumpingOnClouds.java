package en.caps.hackerrank.interviewprep;

public class JumpingOnClouds {

	public static void main(String[] args) {

		int[] ar = { 0, 0, 0, 1, 0, 0 };
		System.out.println(jumpingOnClouds(ar));

		int[] ar2 = { 0, 0, 1, 0, 0, 1, 0 };
		System.out.println(jumpingOnClouds(ar2));

	}

	static int jumpingOnClouds(int[] c) {
		int jumps = 0;
		int i = 0;
		while (i < c.length) {
			if (i + 2 < c.length && c[i + 2] == 0) {
				jumps += 1;
				i += 2;
			} else if (i + 1 < c.length && c[i + 1] == 0) {
				jumps += 1;
				i += 1;
			} else if (i < c.length && c[i] == 0) {
				//jumps += 1;
				i += 1;
			}
		}
		return jumps;
	}

}
