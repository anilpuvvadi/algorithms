package com.home.algorithms.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelTraversal {

	public List<LinkedList<TreeNode>> listofdepths(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> list = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(null);
		LinkedList<TreeNode> ll = new LinkedList<TreeNode>();
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			if (temp == null) {
				list.add(ll);
				ll = new LinkedList<TreeNode>();
				if(!queue.isEmpty())
				queue.add(null);
			} else {
				ll.add(temp);
				if (temp.left != null) {
					queue.add(temp.left);

				}
				if (temp.right != null) {
					queue.add(temp.right);
				}
			}
		}
		return list;
	}

	public static void main(String args[]){
		LevelTraversal lt = new LevelTraversal();
		TreeNode root = new TreeNode(1);
	    root.left = new TreeNode(2);
	    root.left.left = new TreeNode(4);
	    root.left.right = new TreeNode(5);
	    root.right = new TreeNode(3);
	    root.right.left = new TreeNode(6);
	    root.right.right = new TreeNode(7);
	    List<LinkedList<TreeNode>> lists = lt.listofdepths(root);
	    for(LinkedList<TreeNode> list:lists){
	    	for(TreeNode t : list){
	    		System.out.println("elem"+t.value);
	    	}
	    	System.out.println("depth done");
	    }
	}
}
