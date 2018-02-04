package com.home.algorithms.trees;

import java.util.List;
import java.util.Stack;

public class RootPathsSum {

	public void sumpaths(TreeNode root,List<Integer> sumpath, int pathlen, int cursum, int total){
		if(root == null) {
			return;
		}
		cursum+=root.value;
		sumpath.add(pathlen++,root.value);
		if(cursum==total){
			print(sumpath,pathlen);
		} 	else {
			sumpaths(root.left,sumpath, pathlen, cursum, total);
			sumpaths(root.right,sumpath, pathlen, cursum, total);
		}
	}
	
	private void print(List<Integer> path, int pathlength) {
		System.out.println("***path begin***");
		for(int i =0;i<pathlength;i++){
			System.out.println(path.get(i));
		}
		System.out.println("***path end***");
	}
	
	public static void main(String args[]){
		RootPathsSum p = new RootPathsSum();
		TreeNode root = new TreeNode(1);
	    root.left = new TreeNode(3);
	    root.left.left = new TreeNode(2);
	    root.left.right = new TreeNode(1);
	    root.left.right.left = new TreeNode(1);
	    root.right = new TreeNode(-1);
	    root.right.left = new TreeNode(4);
	    root.right.left.left = new TreeNode(1);
	    root.right.left.right = new TreeNode(2);
	    root.right.right = new TreeNode(5);
	    root.right.right.right = new TreeNode(2);
	    int k = 5;
	   p.sumpaths(root, new Stack<Integer>(),0,0,k);
//	   
//		RootPathsSum p = new RootPathsSum();
//		TreeNode root  = new TreeNode(10);
//	    root.left  = new TreeNode(28);
//	    root.right = new TreeNode(13);
//	 
//	    root.right.left   = new TreeNode(14);
//	    root.right.right  = new TreeNode(15);
//	 
//	    root.right.left.left   = new TreeNode(21);
//	    root.right.left.right  = new TreeNode(22);
//	    root.right.right.left  = new TreeNode(20);
//	    root.right.right.right = new TreeNode(24);
//	    int sum = 58;
//	    
//	    p.sumpaths(root, new ArrayList<Integer>(),0,0,sum);
		
	}
}

