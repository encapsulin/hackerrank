package en.caps.hackerrank.days30;

/*public class Day23BSTLevelOrderTraversal {

	public static void main(String[] args) {
		

	}

}*/

import java.util.*;
import java.io.*;

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day23BSTLevelOrderTraversal {

	static List<StringBuilder> ll = new ArrayList<>();
	static int level = 0;

	static void levelOrder(Node root, int level) {
		if (root == null)
			return;

		StringBuilder sb = null;

		if (ll.size() <= level) {
			sb = new StringBuilder();
			ll.add(sb);
		}
		sb = ll.get(level);

		sb.append(root.data);
		levelOrder(root.left, level + 1);
		levelOrder(root.right, level + 1);

	}

	static void levelOrder1(Node root) {
		levelOrder(root, 0);
		System.out.println(ll);
//		for (StringBuilder sb : ll)
//			for (int i = 0; i < sb.length(); i++)
//				System.out.print(sb.charAt(i) + " ");

	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	static void levelOrder(Node root) {
		LinkedList<Node> fifo = new LinkedList<>();
		Node node;
		
		if (root != null)
			fifo.add(root);

		while (fifo.size() > 0) {
			node = fifo.removeFirst();
			System.out.print(node.data + " ");
			if (node.left != null)
				fifo.add(node.left);
			if (node.right != null)
				fifo.add(node.right);			
		}
	}

	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
		Node root = null;
//		while (T-- > 0) {
//			int data = sc.nextInt();
//			root = insert(root, data);
//		}

		int[] ar = { 3, 5, 4, 7, 2, 1 }; // 3 2 5 1 4 7
//		int[] ar = { 3, 5, 2, 1, 4, 6, 7 }; //3 2 5 1 4 6 7
//		int[] ar = { 4, 4 ,4};
		for (int data : ar)
			root = insert(root, data);
		//
		levelOrder(root);
	}
}