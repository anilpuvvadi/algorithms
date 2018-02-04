package com.home.algorithms.trees;

import java.util.Stack;


public class PrintPathsStack1 {
	
	public void printpath(TreeNode root, Stack<Integer> path){
		if(root == null){
			return;
		}
		path.push(root.value);
		if(root.left == null && root.right == null){
			print(path);
		}
		else {
			printpath(root.left,path);
			printpath(root.right,path);
		}
		path.pop();
	}
	
	private void print(Stack<Integer> path) {
		System.out.println("***path begin***");
		for(int i =0;i<path.size();i++){
			System.out.println(path.get(i));
		}
		System.out.println("***path end***");
	}
	
	public static void main(String args[]){
		PrintPathsStack1 p = new PrintPathsStack1();
		TreeNode root  = new TreeNode(10);
	    root.left  = new TreeNode(28);
	    root.right = new TreeNode(13);
	 
	    root.right.left   = new TreeNode(14);
	    root.right.right  = new TreeNode(15);
	 
	    root.right.left.left   = new TreeNode(21);
	    root.right.left.right  = new TreeNode(22);
	    root.right.right.left  = new TreeNode(23);
	    root.right.right.right = new TreeNode(24);	    
	    p.printpath(root, new Stack<Integer>());
		
	}
}

