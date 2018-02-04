package com.home.algorithms.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	private class Portion {

		int open_count;
		int close_count;
		String val;

		public Portion(int open_count, int close_count, String val) {
			this.open_count = open_count;
			this.close_count = close_count;
			this.val = val;
		}

	}

	public List<String> generateParentheses(int n) {
		LinkedList<Portion> queue = new LinkedList<Portion>();
		List<String> paranthesesList = new ArrayList<String>();
		queue.add(new Portion(0, 0, ""));
		while (!queue.isEmpty()) {
			Portion portion = queue.poll();
			if (portion.open_count == n && portion.close_count == n) {
				paranthesesList.add(portion.val);
			}
			if (portion.open_count < n) {
				queue.add(new Portion(portion.open_count + 1,
						portion.close_count, portion.val + "("));
			}
			if (portion.open_count > portion.close_count) {
				queue.add(new Portion(portion.open_count,
						portion.close_count + 1, portion.val + ")"));
			}
		}
		return paranthesesList;

	}

	public void printList(List<String> paranthesis) {
		for (String s : paranthesis) {
			System.out.println(s);
		}

	}

	public static void main(String args[]) {
		Solution s = new Solution();
		List<String> paranthesis = s.generateParentheses(5);
		s.printList(paranthesis);
	}
}
