package com.home.algorithms.trees;

import java.util.List;
import java.util.Stack;

public class RootPathSumStack {

	public void sumpaths(TreeNode root, Stack<Integer >path, int total,int sum){
		
		if(root ==null)
			return;
		sum+=root.value;
		path.push(root.value);
		if(sum==total){
			print(path);
		}
		else {
			sumpaths(root.left,path,total,sum);
			sumpaths(root.right,path,total,sum);
		}
		
		path.pop();
		
	}
	
	private void print(List<Integer> path) {
	
		System.out.println("***path start***");
		for(int j =0;j<path.size();j++){
			System.out.println(path.get(j));
		}
		System.out.println("***path end***");
	}
	
	public static void main(String args[]){
		RootPathSumStack p = new RootPathSumStack();
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
	   p.sumpaths(root, new Stack<Integer>(),k,0);
		
	}
}

