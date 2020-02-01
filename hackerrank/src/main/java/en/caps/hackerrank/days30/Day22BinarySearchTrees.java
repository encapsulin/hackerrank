package en.caps.hackerrank.days30;

import java.util.Scanner;

/*public class Day22BinarySearchTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day22BinarySearchTrees {

	public static int getHeight(Node root) {
		if (root == null)
			return 0;

		int hLeft = 0;// getHeight(root.left);
		if (root.left != null)
			hLeft = 1 + getHeight(root.left);

		int hRight = 0;// getHeight(root.right);
		if (root.right != null)
			hRight = 1 + getHeight(root.right);

		int max = (hLeft > hRight) ? hLeft : hRight;

		return max;
	}

	public static int getHeight1(Node root) {
		if (root == null)
			return 0;

		int hLeft = 0;
		if (root.left != null)
			hLeft = getHeight(root.left);

		int hRight = 0;
		if (root.right != null)
			hRight = getHeight(root.right);

		int max = (hLeft > hRight) ? hLeft : hRight;
		return max + 1;
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

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}
}