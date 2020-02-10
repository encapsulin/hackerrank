package en.caps.hackerrank.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class JesseCookies {

	public static void main(String[] args) {
		 System.out.println("main()");
		Random random = new Random(30);

		int num = 1000000;
		long l1 = System.currentTimeMillis();
		long l2 = System.currentTimeMillis();

//		ArrayList<Integer> al = new ArrayList<>();
//		for (int i = 0; i < num; i++)
//			al.add(i, random.nextInt(10));
//		// System.out.println(al.toString());
//
//		long l1 = System.currentTimeMillis();
//		for (int i = 0; i < num; i++)
//			al.remove(Integer.valueOf(random.nextInt(10)));
//		long l2 = System.currentTimeMillis();
//		// System.out.println(al.toString());
//		System.out.println(l2 - l1);
//
//		LinkedList<Integer> ll = new LinkedList<>();
//		for (int i = 0; i < num; i++)
//			ll.add(i, random.nextInt(10));
//		// System.out.println(al.toString());
//
//		l1 = System.currentTimeMillis();
//		for (int i = 0; i < num; i++)
//			ll.remove(Integer.valueOf(random.nextInt(10)));
//		l2 = System.currentTimeMillis();
//		// System.out.println(al.toString());
//		System.out.println(l2 - l1);
//
//		for (int i = 0; i < num; i++)
//			ll.add(i, random.nextInt(10));
		// System.out.println(al.toString());
////////////////////////////////////////////////
		l1 = System.currentTimeMillis();
//		for (int i = 0; i < num; i++)
//			ll.remove((int)random.nextInt(10));
		l2 = System.currentTimeMillis();
		// System.out.println(al.toString());
//		System.out.println(l2 - l1);		
//		SortedMap<Integer, Integer> aMap = new TreeMap<>(new Comparator() {
////			public int 
//		});
//	    for(int i = 0; i < 10; i++)
//	    	aMap.put(i, random.nextInt(10));

//		System.out.println(aMap.toString());

//		    SortedSet<Integer> numberSet = new TreeSet<>();
		num = 10000000;
		int k = 1000;
		int[] A = new int[num];
		for (int i = 0; i < num; i++)
			A[i] = random.nextInt(k);

//		int k = 7;
//		int[] A = { 2, 1, 3, 9, 10, 12 };
//		int[] A = { 0 };
		l1 = System.currentTimeMillis();
		System.out.println(cookies1(k, A));
		l2 = System.currentTimeMillis();
		System.out.println((l2 - l1) + " ms");
	}

	static int cookies7(int k, int[] A) {
		PriorityQueue<Integer> ll = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i1 - i2;
			}
		});

		Arrays.sort(A);
		int a_len = A.length;
		int a_index = 0;
		if (a_len > 3 && A[a_len - 3] == 0) {
			a_index = a_len - 4;
		}
		for (int i = a_index; i < A.length; i++) {
			ll.add(A[i]);
		}

		//System.out.println(ll);

		int cnt = 0;
		boolean b = true;
		while (b && ll.peek() < k) {
			int tmp1 = ll.poll();
			int tmp2 = 0;
			try {
				tmp2 = ll.poll();
			} catch (Exception e) {
//				e.printStackTrace();
				b = false;
			}
			ll.add(tmp1 + 2 * tmp2);
			cnt++;
		}

		if (ll.peek() >= k)
			return cnt;
		return -1;
	}

	// 22:time
	static int cookies6(int k, int[] A) {
		PriorityQueue<Integer> ll = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i1 - i2;
			}
		});

		Arrays.sort(A);
		// 20:time 22:ok 22time
		int a_len = A.length;
		if (a_len == 1 && A[0] < k)
			return -1;
		if (a_len > 3 && A[a_len - 3] == 0) {
			if ((A[a_len - 2] + 2 * A[a_len - 1]) < k)
				return -1;
		}

		for (int i : A) {
			ll.add(i);
		}

		//System.out.println(ll);

		int cnt = 0;
		while (ll.size() > 1 && ll.peek() < k) {
			int tmp1 = ll.poll();
			int tmp2 = (ll.size() > 0) ? 2 * ll.poll() : 0;
			ll.add(tmp1 + tmp2);
			cnt++;
		}

		if (ll.peek() >= k)
			return cnt;
		return -1;
	}

	static int cookies5(int k, int[] A) {
		PriorityQueue<Integer> ll = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i1 - i2;
			}
		});
		// 20:Wrong Answer 22:time limit
		Arrays.sort(A);
		int a_len = A.length;
		if (a_len == 1 && A[0] < k)
			return -1;
		if (a_len > 3 && (A[a_len - 3] == 0 && ((A[a_len - 2] + 2 * A[a_len - 1]) < k)))
			return -1;

		for (int i : A) {
			ll.add(i);
		}

		//System.out.println(ll);

		int cnt = 0;
		while (ll.size() > 1 && ll.peek() < k) {
			int tmp1 = ll.poll();
			int tmp2 = (ll.size() > 0) ? 2 * ll.poll() : 0;
			ll.add(tmp1 + tmp2);
			cnt++;
		}

		if (ll.peek() >= k)
			return cnt;
		return -1;
	}

	// num = 10000000; time:2000
	static int cookies4(int k, int[] A) {
		PriorityQueue<Integer> ll = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i1 - i2;
			}
		});

		// does not help for 20 22
		int max = 0;
		for (int i : A) {
			ll.add(i);
			if (i > 0)
				max = i;
		}
		if (max == 0)
			return -1;

		int cnt = 0;
		int tmp1 = 0;
		int tmp2 = 0;
		// time exceeds 20 22
		while (ll.size() > 1 && ll.peek() < k) {
			tmp1 = ll.poll();
			tmp2 = (ll.size() > 0) ? 2 * ll.poll() : 0;
			ll.add(tmp1 + tmp2);
			cnt++;
		}

		// err 2 17; time 20
//		do {
//			int tmp1 = 0;
//			if (ll.size() > 0)
//				tmp1 = ll.poll();
//			int tmp2 = 0;
//			if (ll.size() > 0)
//				tmp2 = ll.poll();
//			ll.add(tmp1 + 2 * tmp2);
//			cnt++;
//		} while (ll.size() > 1 && ll.peek() < k);

		if (ll.peek() >= k)
			return cnt;

		return -1;
	}

	// num = 1000000; time:84
	// 2 errs
	static int cookies3(int k, int[] A) {
		int cnt = 0;
		// LinkedList<Integer> ll = new LinkedList<>();// 342
		PriorityQueue<Integer> ll = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i1 - i2;
			}
		});

		for (int i : A)
			ll.add(i);

		do {
			int tmp1 = 0;
			if (ll.size() > 0)
				tmp1 = ll.poll();
			int tmp2 = 0;
			if (ll.size() > 0)
				tmp2 = ll.poll();
			ll.add(tmp1 + 2 * tmp2);
			cnt++;
		} while (ll.size() > 1 && ll.peek() < k);

		if (ll.peek() >= k)
			return cnt;

		return -1;
	}

	// num = 100000; time:84;
	// 3 err; 2 time exceeds
	// num = 1000000; time:212;
	static int cookies2(int k, int[] A) {
		int cnt = 0;
		// LinkedList<Integer> ll = new LinkedList<>();// 342
		PriorityQueue<Integer> ll = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i1 - i2;
			}
		});

		for (int i : A)
			ll.add(i);

		do {
			int tmp = ll.poll() + 2 * ll.poll();
			ll.add(tmp);
			cnt++;
//			System.out.println(ll.toString());
		} while (ll.peek() < k && ll.size() > 2);

		if (ll.peek() >= k)
			return cnt;

		return -1;

	}

	// num = 100000; time:5589
	static int cookies1(int k, int[] A) {

		int cnt = 0;
		List<Integer> ll = new ArrayList<>();
		for (int i : A)
			ll.add(i);
//      System.out.println(ll);
		Collections.sort(ll);
//      System.out.println(ll);
		while (ll.get(0) < k && ll.size() > 2) {
			int t = ll.remove(0) + 2 * ll.remove(1);
			ll.add(t);
			Collections.sort(ll);
			cnt++;
		}
		if (ll.get(0) >= k)
			return cnt;

		return -1;

	}
}
