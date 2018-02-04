package com.home.algorithms.trees;

public class BST {

	class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private int value;

		public TreeNode(int data) {
			this.left = null;
			this.right = null;
			this.value = data;
		}
	}

	public boolean checkifBST(TreeNode root, Integer min, Integer max) {
		if (root == null) {
			return true;
		}
		if (min != null && root.value < min || max != null && root.value > max)
			return false;

		if (!checkifBST(root.left, min, root.value)
				|| !checkifBST(root.right, root.value, max))
			return false;
		return true;
	}

	public static void main(String args[]) {
		BST bst = new BST();
		BST.TreeNode root = bst.new TreeNode(50);
		root.left = bst.new TreeNode(40);
		root.left.left = bst.new TreeNode(30);
		root.left.right = bst.new TreeNode(55);
		root.right = bst.new TreeNode(60);
		root.right.left = bst.new TreeNode(55);
		root.right.right = bst.new TreeNode(70);
		System.out.println("value=>" + bst.checkifBST(root, null, null));
	}
}
