package en.caps.hackerrank.algo;

import java.util.LinkedList;

public class EqualStacks {

	public static void main(String[] args) {
//		int[] h1 = { 3, 2, 1, 1, 1 };
//		int[] h2 = { 4, 3, 2 };
//		int[] h3 = { 1, 1, 4, 1 };

		int[] h1 = { 1 };
		int[] h2 = { 2 };
		int[] h3 = { 1 };
		System.out.println(equalStacks(h1, h2, h3));
	}

	static int equalStacks2(int[] h1, int[] h2, int[] h3) {
		LinkedList<Integer> stack1 = new LinkedList<>();
		int sum = 0;
		for (int i = h1.length - 1; i >= 0; i--) {
			sum += h1[i];
			stack1.add(sum);
		}

		sum = 0;
		LinkedList<Integer> stack2 = new LinkedList<>();
		for (int i = h2.length - 1; i >= 0; i--) {
			sum += h2[i];
			stack2.add(sum);
		}

		sum = 0;
		LinkedList<Integer> stack3 = new LinkedList<>();
		for (int i = h3.length - 1; i >= 0; i--) {
			sum += h3[i];
			stack3.add(sum);
		}
		System.out.println(stack1);
		System.out.println(stack2);
		System.out.println(stack3);

		for (int i1 = stack1.size() - 1; i1 >= 0; i1--) {
			int s1 = stack1.get(i1);
			int s2 = stack2.get(0);
			for (int i2 = stack2.size() - 1; i2 >= 0; i2--) {
				s2 = stack2.get(i2);
				if (s1 >= s2)
					break;
			}
			int s3 = stack3.get(0);
			for (int i3 = stack3.size() - 1; i3 >= 0; i3--) {
				s3 = stack3.get(i3);
				if (s1 >= s3)
					break;
			}
			if (s1 == s2 && s2 == s3)
				return s1;
		}
		return 0;
	}

	static int equalStacks(int[] h1, int[] h2, int[] h3) {
		LinkedList<Integer> stack1 = new LinkedList<>();
		int sum = 0;
		for (int i = h1.length - 1; i >= 0; i--) {
			sum += h1[i];
			stack1.add(sum);
		}

		sum = 0;
		LinkedList<Integer> stack2 = new LinkedList<>();
		for (int i = h2.length - 1; i >= 0; i--) {
			sum += h2[i];
			stack2.add(sum);
		}

		sum = 0;
		LinkedList<Integer> stack3 = new LinkedList<>();
		for (int i = h3.length - 1; i >= 0; i--) {
			sum += h3[i];
			stack3.add(sum);
		}
		System.out.println(stack1);
		System.out.println(stack2);
		System.out.println(stack3);

		int l1 = stack1.getLast();
		int l2 = stack2.getLast();
		int l3 = stack3.getLast();
		while ((l1 != l2 || l2 != l3) && stack1.size() > 0 && stack2.size() > 0 && stack3.size() > 0) {

			if (l1 > l2) {
				stack1.removeLast();
				if (stack1.size() > 0)
					l1 = stack1.getLast();
			}
			if (l2 > l3) {
				stack2.removeLast();
				if (stack2.size() > 0)
					l2 = stack2.getLast();
			}
			if (l3 > l1) {
				stack3.removeLast();
				if (stack3.size() > 0)
					l3 = stack3.getLast();
			}

		}
		if (stack1.size() > 0 && stack2.size() > 0 && stack3.size() > 0)
			return stack1.getLast();

		return 0;
	}
}
