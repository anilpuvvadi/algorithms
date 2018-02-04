package com.home.algorithms.trees;

public class FindMinMax {
	

public int findmin(TreeNode root, int min){
	if(root == null){
		return -1;
	}
	int leftmin = findmin(root.left,min);
	int rightmin = findmin(root.right,min);
	if(leftmin<rightmin){
		min = leftmin;
	}
	if(root.value<min){
		min = root.value;
	}
	return min;
	
}

}
