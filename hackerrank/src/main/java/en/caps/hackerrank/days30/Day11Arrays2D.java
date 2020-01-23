package en.caps.hackerrank.days30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day11Arrays2D {

	public static void main(String[] args) {
		int[][] iMatrix = { 
				{ 1, 1, 1, 0, 0, 0 }, 
				{ 0, 1, 0, 0, 0, 0 },
				{ 1, 1, 1, 0, 0, 0 }, 
				{ 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
//		int[][] iMatrix = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
//				{ 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 }, { 31, 32, 33, 34, 35, 36 } };
		System.out.println(iHourGlassSumMax(iMatrix));
	}

	public static int iHourGlassSumMax(int[][] iMatrix) {
		List<Integer> iSumArr = new ArrayList<>();
		for (int iRow = 0; iRow <= 3; iRow++) {

			for (int iCol = 0; iCol <= 3; iCol++) {
				int iSum = 0;
				iSum += iMatrix[iRow][iCol] + iMatrix[iRow][iCol + 1] + iMatrix[iRow][iCol + 2];
				iSum += iMatrix[iRow + 1][iCol + 1];
				iSum += iMatrix[iRow + 2][iCol] + iMatrix[iRow + 2][iCol + 1] + iMatrix[iRow + 2][iCol + 2];
				System.out.println(iSum);
				iSumArr.add(iSum);
				iSum = 0;
			}
		}
//		System.out.println(iSumArr);
		Collections.sort(iSumArr);
//		System.out.println(iSumArr);
		int iSumMax = iSumArr.get(iSumArr.size() - 1);
		return iSumMax;
	}
}
