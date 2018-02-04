package com.home.algorithms.general;

public class LLN {

	public class LLNode {
		private int data;
		private LLNode next;

		public LLNode(int data) {
			this.data = data;
		}
	}

	LLNode deleteNode(int n, LLNode root) {
		if (n < 1) {
			return null;
		}
		if (root == null) {
			return null;
		}
		if (n == 1) {
			root = root.next;
			return root;
		}
		LLNode prev = null;
		LLNode cur = root;
		int count = 1;
		while (cur != null) {
			if (count == n) {
				prev.next = cur.next;
			}
			prev = cur;
			cur = cur.next;
			count++;
		}
		return root;
	}

	int findMinNode(LLNode root) {
		int min = Integer.MAX_VALUE;
		if (root == null) {
			return min;
		}
		LLNode cur = root;
		while (cur != null) {
			if (cur.data < min) {
				min = cur.data;
			}
			cur = cur.next;
		}
		return min;
	}

	public static void main(String arg[]) {
		LLN lln = new LLN();
		LLN.LLNode llnode = lln.new LLNode(-5);
		llnode.next = lln.new LLNode(5);
		llnode.next.next = lln.new LLNode(6);
		llnode.next.next.next = lln.new LLNode(7);
		llnode.next.next.next.next = lln.new LLNode(-4);
		System.out.println("min =>" + lln.findMinNode(llnode));
		LLN.LLNode temp = lln.deleteNode(1, llnode);
		System.out.println("temp =>" + temp.toString());
		System.out.println("min =>" + lln.findMinNode(temp));
	}

}
