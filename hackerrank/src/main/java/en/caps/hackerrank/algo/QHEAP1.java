package en.caps.hackerrank.algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class QHEAP1 {

	public static void main(String[] args) throws Exception {
		int i = 0;
//		i = 98;
			System.out.println(i);
		System.out.println("main()");
		long l1 = System.currentTimeMillis();
		mainReader();
		// mainScan();
		long l2 = System.currentTimeMillis();
		System.out.println("\n" + (l2 - l1) + " ms");
	}

	public static void mainScan() {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// scan.next();
		scan.nextLine();
		String s = null;
		while (n-- > 0) {
			s = scan.nextLine();
			processLine(s, 1);
		}
		scan.close();
	}

	public static void mainReader(String... args) throws Exception {
//		String fn = "file.in.100.txt";
		String fn = "file.in.txt";
		File f = new File(fn);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s = null;
		while ((s = br.readLine()) != null) {
			processLine(s, 2);
			// System.out.println(ll.toString());
		}
		br.close();

//		System.out.println("\n#################\n");
//		
//		Path p = Paths.get(fn);
//		BufferedReader br2 = Files.newBufferedReader(p);		
//		while( (s = br2.readLine()) != null) {
//			System.out.println(s);
//		}

	}

	public static void mainWriter(String[] args) throws IOException {
		System.out.println("main()");
		long l1 = System.currentTimeMillis();

		Random rnd = new Random();
		int cnt = 1000000;

		String fn = "file.in.100.txt";
		FileWriter fw = new FileWriter(fn);
		BufferedWriter bw = new BufferedWriter(fw);

		while (cnt-- > 0) {
			int i1 = 1 + rnd.nextInt(3);
			String s = "" + i1;
			if (i1 == 1) {
				int i2 = rnd.nextInt(100);
				s += " " + i2;
			}
			// System.out.println(s);
			bw.write(s + "\n");
		}
		bw.close();
		long l2 = System.currentTimeMillis();
		System.out.println("\n;" + (l2 - l1) + " ms");
	}

	static HashSet<Integer> ll = new HashSet<>();
	static int min = Integer.MAX_VALUE;

//	9/19 test cases failed
//	Test case 9 time limit
	private static void processLine(String s, int debug) {
		if (debug > 1)
			System.out.print("\n>" + s + " ");
		Integer tmp = 0;
		try {
			String[] sarr = s.split(" ");
			switch (sarr[0]) {
			case "1":
				tmp = Integer.parseInt(sarr[1]);
				ll.add(tmp);
				if (min > tmp)
					min = tmp;
				break;
			case "2":
				tmp = Integer.valueOf(sarr[1]);
				if(ll.remove(tmp));
				if (tmp == min) {
					min = Integer.MAX_VALUE;
					for (int i : ll)
						if (min > i)
							min = i;
				}
				break;
			case "3":
				if (min == 0)
					for (int i : ll)
						if (min > i)
							min = i;
				if (debug > 0)
					System.out.println(min);
				break;
			}
		} catch (Exception e) {

		}
		if (debug > 1) {
			System.out.print("\t"+ll.toString());
			System.out.print(" min:" + min);
		}

	}
}

