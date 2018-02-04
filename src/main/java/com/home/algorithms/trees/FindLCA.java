package com.home.algorithms.trees;

public class FindLCA {
	
	public TreeNode findLCA(TreeNode root, int n1, int n2){
		if(root ==null){
			return null;
		}
		if(n1 == root.value || n2 == root.value){
			return root;
		}
		TreeNode left = findLCA(root.left,n1,n2);
		TreeNode right = findLCA(root.right,n1,n2);
		
		if(left!=null && right!=null){
			return root;
		}
		return left!=null?left:right;
	}
}
