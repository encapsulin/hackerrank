package en.caps.hackerrank.algo;

import java.util.ArrayList;
import java.util.Arrays;

public class MagicSquare {

	public static void main(String[] args) {
		int[][] s = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 5 } };
		System.out.println(formingMagicSquare(s));
		int[][] s1 = { { 4, 8, 2 }, { 4, 5, 7 }, { 6, 1, 6 } };
		System.out.println(formingMagicSquare(s1));

	}

	static int formingMagicSquare(int[][] arr) {
		ArrayList<Integer> diffs = new ArrayList<>();
		int[][] arrMagic = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };

		diffs.add(MagicSquareSolver.calcDiff(arr, arrMagic));
		for (int i = 0; i < 4; i++) {
			arr = MagicSquareSolver.rotate(arr);
			diffs.add(MagicSquareSolver.calcDiff(arr, arrMagic));
		}
		arr = MagicSquareSolver.flipV(arr);
		for (int i = 0; i < 4; i++) {
			arr = MagicSquareSolver.rotate(arr);
			diffs.add(MagicSquareSolver.calcDiff(arr, arrMagic));
		}
		arr = MagicSquareSolver.flipH(arr);
		for (int i = 0; i < 4; i++) {
			arr = MagicSquareSolver.rotate(arr);
			diffs.add(MagicSquareSolver.calcDiff(arr, arrMagic));
		}
		
		System.out.println("diffs:" + diffs);

		// return diffs.stream().mapToInt().min((i1,i2)->{return i1-i2;});
		return diffs.stream().min((i1, i2) -> {
			return i1 - i2;
		}).orElse(0);
	}

}

class MagicSquareSolver {
	static int[][] flipV(int[][] arr) {
		int[][] arr2 = new int[3][3];
		arr2[0][0] = arr[0][2];
		arr2[1][0] = arr[1][2];
		arr2[2][0] = arr[2][2];

		arr2[0][1] = arr[0][1];
		arr2[1][1] = arr[1][1];
		arr2[2][1] = arr[2][1];

		arr2[0][2] = arr[0][0];
		arr2[1][2] = arr[1][0];
		arr2[2][2] = arr[2][0];

		return arr2;
	}

	static int[][] flipH(int[][] arr) {
		int[][] arr2 = new int[3][3];
		arr2[0][0] = arr[2][0];
		arr2[0][1] = arr[2][1];
		arr2[0][2] = arr[2][2];

		arr2[1][0] = arr[1][0];
		arr2[1][1] = arr[1][1];
		arr2[1][2] = arr[1][2];

		arr2[2][0] = arr[0][0];
		arr2[2][1] = arr[0][1];
		arr2[2][2] = arr[0][2];

		return arr2;
	}

	static int[][] rotate(int[][] arr) {
		int[][] arr2 = new int[3][3];
		arr2[1][1] = arr[1][1];
		arr2[0][0] = arr[0][2];
		arr2[0][1] = arr[1][2];
		arr2[0][2] = arr[2][2];
		arr2[1][2] = arr[2][1];
		arr2[2][2] = arr[2][0];
		arr2[2][1] = arr[1][0];
		arr2[2][0] = arr[0][0];
		arr2[1][0] = arr[0][1];
		return arr2;
	}

	static int calcDiff(int[][] arr, int[][] arrMagic) {
		int iPrice = 0;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				iPrice += Math.abs(arr[i][j] - arrMagic[i][j]);
		return iPrice;
	}

	static void print(int[][] arr) {
		System.out.println("print:");
		for (int[] aj : arr)
			System.out.println(Arrays.toString(aj));
	}
}
