package en.caps.hackerrank.algo.BSTLowestCommonAncestor;

import java.util.*;
import java.io.*;

class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class Solution {

	/*
	 * class Node int data; Node left; Node right;
	 */

//	static boolean findPath(Node root, int v1,StringBuilder sb) {
//		if(root == null)
//			return false;
//		
//		if(root.data == v1) {
//			return true;
//		}
//		
//		if(v1<root.data)
//			return(findPath(root.left,v1));
//		else if(v1>root.data)
//			return(findPath(root.right,v1));
//		
//		return null;
//	}

	public static Node lca1(Node root, int v1, int v2) {
		if (root == null)
			return null;

		if (v1 < root.data && root.data > v2)
			return root;

		if (v1 < root.data && v2 < root.data)
			return root.left;
		if (v1 > root.data && v2 > root.data)
			return root.right;

		return root;
	}

	public static Node lca(Node root, int v1, int v2) {
		if (root == null)
			return null;

		if (v1 > v2) {
			int tmp = v1;
			v1 = v2;
			v2 = tmp;
		}

		if (v1 < root.data && root.data < v2)
			return root;

		if (v1 < root.data && v2 < root.data)
			root = lca(root.left, v1, v2);
		if (v1 > root.data && v2 > root.data)
			root = lca(root.right, v1, v2);

		return root;
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

	public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
//        Node root = null;
//        while(t-- > 0) {
//            int data = scan.nextInt();
//            root = insert(root, data);
//        }
//      	int v1 = scan.nextInt();
//      	int v2 = scan.nextInt();
//        scan.close();

		Node root = null;
//    	int[] dataA = {4,2,3,1,7,6};
//    	int v1 = 1;
//    	int v2 = 7;
		// 4

//    	int[] dataA = {5,3,8,2,4,6,7};//5
//    	int v1 = 7;
//    	int v2 = 3;

		int[] dataA = { 6, 4, 2, 3, 1, 7, 0, 5 };
		int v1 = 0;
		int v2 = 5;
		// 4?

		for (int data : dataA)
			root = insert(root, data);

		viewBST(root);

		Node ans = lca(root, v1, v2);
		System.out.println("\n"+ ans.data);
	}

	private static void viewBST(Node root) {
		if (root != null) {
			System.out.print("\nnode.data:" + root.data);
			if (root.left != null) {
				System.out.print(" .left:" + root.left.data);
			}
			if (root.right != null) {
				System.out.print(" .right:" + root.right.data);
			}
			viewBST(root.left);
			viewBST(root.right);
		}

	}
}