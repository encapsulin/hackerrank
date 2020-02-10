package en.caps.hackerrank.algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class MaximumElement {

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
			processLine(s, 2);
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
			processLine(s, 1);
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

//11 time; 2100ms
//	static LinkedList<Integer> ll = new LinkedList<>();
//	private static void processLine1(String s) {
//		try {
//			String[] sarr = s.split(" ");
//			switch (sarr[0]) {
//			case "1":
//				ll.push(Integer.valueOf(sarr[1]));
//				break;
//			case "2":
//				ll.pop();
//				break;
//			case "3":
//				int i = ll.stream().max((i1, i2) -> i1 - i2).orElse(0);
//				// System.out.println(i);
//				break;
//			}
//		} catch (Exception e) {
//
//		}
//	}

//	static PriorityQueue<Integer> lifo = new PriorityQueue<>();
//	private static void processLine(String s) {
//		try {
//			String[] sarr = s.split(" ");
//			switch (sarr[0]) {
//			case "1":
//				lifo.add(Integer.valueOf(sarr[1]));
//				break;
//			case "2":
//				lifo.remove();
//				break;
//			case "3":
//				int i = lifo..get(l)
//				//System.out.println(i);
//				break;
//			}
//		} catch (Exception e) {
//
//		}
//	}	

	// 1300 11 cases time exceed
	static LinkedList<Integer> ll = new LinkedList<>();
	static int max = 0;

	// 240ms! 9/28 test cases failed (3-11)
	private static void processLine(String s, int debug) {
		if (debug > 1)
			System.out.print(">" + s + " ");
		int tmp = 0;
		try {
			String[] sarr = s.split(" ");
			switch (sarr[0]) {
			case "1":
				tmp = Integer.parseInt(sarr[1]);
				ll.push(tmp);
				if (max < tmp)
					max = tmp;
				break;
			case "2":
				tmp = ll.pop();
				if (tmp == max) {
					max = 0;
					for (int i : ll)
						if (max < i)
							max = i;
				}
				break;
			case "3":
				if (max == 0)
					for (int i : ll)
						if (max < i)
							max = i;
				if (debug > 0)
					System.out.println(max);
				break;
			}
		} catch (Exception e) {

		}
		if (debug > 1) {
			System.out.print(" "+ll.toString());
			System.out.println("max:" + max);
		}

	}
}
