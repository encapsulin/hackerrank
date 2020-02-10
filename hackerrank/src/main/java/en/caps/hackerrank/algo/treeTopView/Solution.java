package en.caps.hackerrank.algo.treeTopView;

import java.util.Scanner;
import java.util.TreeMap;

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
	 * 
	 * class Node int data; Node left; Node right;
	 */

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

	public static void mainScan(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		topView(root);
	}

	public static void mainRead(int[] dataArr) {

		Node root = null;
		for (int data : dataArr) {
			root = insert(root, data);
		}
		topView(root);
	}

	public static void main(String[] args) {
		System.out.println("main()");
		long l1 = System.currentTimeMillis();
		mainRead(new int[] { 1, 14, 3, 7, 4, 5, 15, 6, 13, 10, 11, 2, 12, 8, 9 });
		long l2 = System.currentTimeMillis();
		System.out.println("\n" + (l2 - l1) + " ms");
	}

	static class MapNode {
		public int iLevelX = 0;
		public int iLevelY = 0;
		public int iData = 0;

		public MapNode(int iLevelX, int iLevelY, int iData) {
			this.iLevelX = iLevelX;
			this.iLevelY = iLevelY;
			this.iData = iData;
		}
	}

	public static TreeMap<Integer, MapNode> aMap = new TreeMap<>();

	public static void MapNode_add(int iLevelX, int iLevelY, int iData) {

		if (!aMap.containsKey(iLevelX)) {
			aMap.put(iLevelX, new MapNode(iLevelX,iLevelY,iData));
		}else {
			MapNode mapNode = aMap.get(iLevelX);
			if(mapNode.iLevelY > iLevelY) {
				mapNode.iLevelY = iLevelY;
				mapNode.iData = iData;
			}
		}
	}

	public static void topView(Node root, int iLevelX, int iLevelY) {
		if (root == null)
			return;
		MapNode_add(iLevelX, iLevelY, root.data);
		topView(root.left, iLevelX - 1, iLevelY + 1);
		topView(root.right, iLevelX + 1, iLevelY + 1);
	}

	public static void topView(Node root) {
		topView(root, 0, 0);		
		//System.out.println(aMap.keySet().toString());
		for(int i:aMap.keySet())
			System.out.print(aMap.get(i).iData+ " ");
	}

}