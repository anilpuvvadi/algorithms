package com.home.algorithms.trees;

public class NextHighest1 {

	class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int value;
		public TreeNode(int data){
			this.left = null;
			this.right = null;
			this.value = data;
		}
	}
		public TreeNode getMinNode(TreeNode root){
			TreeNode cur = root;
			while(cur!=null){
				cur = cur.left;
			}
			return cur;
		}
		
	public TreeNode findNextLargest(TreeNode root, TreeNode target) {
		if(target.right!=null){
			return getMinNode(target.right);
		}
		TreeNode succ =null;
		while(root!=null){
		if(target.value<root.value){
			succ = root;
			root = root.left;
		} else if(target.value>root.value){
			root = root.right;
		} else{
			break;
		}
	}
		return succ;
	}

	public static void main(String args[]){
		
		NextHighest1 lt = new NextHighest1();
		NextHighest1.TreeNode root = lt.new TreeNode(50);
	    root.left = lt.new TreeNode(40);
	    root.left.left = lt.new TreeNode(30);
	    root.left.right = lt.new TreeNode(45);
	    root.right = lt.new TreeNode(60);
	    root.right.left = lt.new TreeNode(55);
	    root.right.right = lt.new TreeNode(70);
	    TreeNode temp = lt.findNextLargest(root,root.right.left);
	    	System.out.println("value=>"+temp.value);
	    }

	}
