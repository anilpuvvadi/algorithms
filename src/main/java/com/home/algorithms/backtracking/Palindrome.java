package com.home.algorithms.backtracking;

public class Palindrome {

	public static void main(String args[]) {
		System.out.println("Palindrome => "+Palindrome.checkpalindrome("MALAYALAM"));

	}

	public static boolean checkpalindrome(String str) {
		if (str.isEmpty()) {
			return true;
		}
		char[] sa = str.toLowerCase().toCharArray();
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (!Character.isLetterOrDigit(sa[i])) {
				i++;
			} else if (!Character.isLetterOrDigit(sa[j])) {
				j--;
			} else {
				if (Character.isLetterOrDigit(sa[i]) != Character
						.isLetterOrDigit(sa[j]) || sa[i] != sa[j]) {
					return false;
				}
				i++;
				j--;
			}
		}

		return true;
	}
}
