package com.home.algorithms.trees;


public class NextHighest {

	 TreeNodeParent insert(TreeNodeParent node, int data) {
		 
	        /* 1. If the tree is empty, return a new,     
	         single node */
	        if (node == null) {
	            return (new TreeNodeParent(data));
	        } else {
	 
	        	TreeNodeParent temp = null;
	             
	            /* 2. Otherwise, recur down the tree */
	            if (data <= node.value) {
	                temp = insert(node.left, data);
	                node.left = temp;
	                temp.parent = node;
	 
	            } else {
	                temp = insert(node.right, data);
	                node.right = temp;
	                temp.parent = node;
	            }
	 
	            /* return the (unchanged) node pointer */
	            return node;
	        }
	    }

	public TreeNodeParent getMinNode(TreeNodeParent root){
		TreeNodeParent cur = root;
		while(cur!=null){
			cur = cur.left;
		}
		return cur;
	}

    TreeNodeParent findNextLargest(TreeNodeParent root, TreeNodeParent n) {
 
        // step 1 of the above algorithm 
        if (n.right != null) {
            return getMinNode(n.right);
        }
 
        // step 2 of the above algorithm
        TreeNodeParent p = n.parent;
        while (p != null && n == p.right) {
            n = p;
            p = p.parent;
        }
        return p;
    }

public static void main(String args[]){
	
	NextHighest tree = new NextHighest();
	TreeNodeParent root = null, temp = null, suc = null;
     root = tree.insert(root, 50);
     root = tree.insert(root, 40);
     root = tree.insert(root, 60);
     root = tree.insert(root, 30);
     root = tree.insert(root, 45);
     root = tree.insert(root, 55);
     root = tree.insert(root, 70);
     temp = root.right.left;
     suc = tree.findNextLargest(root,temp);
    	System.out.println("value=>"+suc.value);
    }

}
