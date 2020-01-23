package en.caps.hackerrank.algo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(kangaroo(0, 3, 4, 2));// YES
		System.out.println(kangaroo(0, 2, 5, 3));// NO

		StringBuilder sb1 = new StringBuilder("asdf");
		StringBuilder sb2 = new StringBuilder("qwer");
		sb1 = sb2;
		System.out.println(sb1);
		sb1.append("0");
		System.out.println(sb2);
		sb1.insert(5, "!");
		System.out.println(sb1);
		System.out.println(sb2);



	}

	static String kangaroo(int x1, int v1, int x2, int v2) {
		String sR = "NO";
		long iDiffOld = 0;
		long iDiffNow = 0;

		long lx1 = x1;
		long lx2 = x2;

		iDiffOld = Math.abs(lx1 - lx2);
		iDiffNow = Math.abs(lx1 - lx2);

		do {
			lx1 += v1;
			lx2 += v2;
			if (lx1 == lx2) {
				sR = "YES";
				break;
			}
			iDiffOld = iDiffNow;
			iDiffNow = Math.abs(lx1 - lx2);
		} while (iDiffNow < iDiffOld);

		return sR;
	}
	private static final Scanner scanner = new Scanner(System.in);
	 public static void main1(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] x1V1X2V2 = scanner.nextLine().split(" ");

	        int x1 = Integer.parseInt(x1V1X2V2[0]);

	        int v1 = Integer.parseInt(x1V1X2V2[1]);

	        int x2 = Integer.parseInt(x1V1X2V2[2]);

	        int v2 = Integer.parseInt(x1V1X2V2[3]);

	        String result = kangaroo(x1, v1, x2, v2);

	        bufferedWriter.write(result);
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
}
