package com.home.algorithms.trees;

import java.util.List;
import java.util.Stack;

public class SumAnyPaths {

	public void sumpaths(TreeNode root, Stack<Integer> path,int total){
		
		if(root ==null)
			return;
		path.push(root.value);
		sumpaths(root.left,path,total);
		sumpaths(root.right,path,total);
		int sum=0;
		for(int j =path.size()-1;j>=0;j--){
			sum+=path.get(j);
			if(sum==total){
				print(path,j);
			}
		}
		path.pop();
	}
	
	private void print(List<Integer> path, int i) {
		for(int j =i;j<path.size();j++){
			System.out.println(path.get(j));
		}
		System.out.println("***path end***");
	}
	
	public static void main(String args[]){
		SumAnyPaths p = new SumAnyPaths();
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
	    
	    p.sumpaths(root, new Stack<Integer>(),k);
		
	}
}

