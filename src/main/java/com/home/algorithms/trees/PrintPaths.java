package com.home.algorithms.trees;

import java.util.ArrayList;
import java.util.List;

public class PrintPaths {
	
	public void printpath(TreeNode root, List<Integer> path, int pathlength){
		if(root == null){
			return;
		}
		path.add(pathlength++,root.value);
		if(root.left == null && root.right ==null){
			print(path,pathlength);
		} else {
			printpath(root.left,path, pathlength);
			printpath(root.right,path, pathlength);
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
		PrintPaths p = new PrintPaths();
		TreeNode root  = new TreeNode(10);
	    root.left  = new TreeNode(28);
	    root.right = new TreeNode(13);
	 
	    root.right.left   = new TreeNode(14);
	    root.right.right  = new TreeNode(15);
	 
	    root.right.left.left   = new TreeNode(21);
	    root.right.left.right  = new TreeNode(22);
	    root.right.right.left  = new TreeNode(23);
	    root.right.right.right = new TreeNode(24);	    
	    p.printpath(root, new ArrayList<Integer>(),0);
		
	}
}

