package en.caps.hackerrank.algo.bstLevelOrderTraversal;

import java.util.*;
import java.util.Scanner;

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

	static ArrayList<ArrayList<Integer>> alLevels = new ArrayList<>();

	public static void levelOrder(Node root) {

		levelOrderN(root, 0);
		//System.out.println(alLevels.toString());
		for(ArrayList<Integer> al:alLevels)
			for(Integer i:al)
			System.out.print(i+ " ");
	}

	public static void levelOrderN(Node root, int level) {
		if(root == null)
			return;
		
		ArrayList<Integer> alLevel = null;
		if (alLevels.size() -1 < level) {
			alLevel = new ArrayList<>();
			alLevel.add(root.data);
			alLevels.add(alLevel);
		}else {
			alLevel = alLevels.get(level);
			alLevel.add(root.data);
		}
			
		levelOrderN(root.left,level+1);
		levelOrderN(root.right,level+1);
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

	public static void main1(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		levelOrder(root);
	}

	public static void main(String[] args) {
		Node root = null;
		int[] data = { 1, 2, 5, 3, 4, 6 };
		for (int i : data)
			root = insert(root, i);
		levelOrder(root);
	}
}
