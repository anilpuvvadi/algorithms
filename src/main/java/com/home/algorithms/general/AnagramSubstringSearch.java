package com.home.algorithms.general;

public class AnagramSubstringSearch {

	public int compare(char arr1[], char arr2[]) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return -1;
			}
		}
		return 0;
	}

	public void search(String text, String pattern) {

		char countP[] = new char[256];
		char countT[] = new char[256];

		int M = pattern.length();
		int N = text.length();
		for (int i = 0; i < M; i++) {
			(countP[pattern.charAt(i)])++;
			countT[text.charAt(i)]++;
		}
		for (int i = M; i < N; i++) {
			if (compare(countP, countT) == 0) {
				System.out.println("index found at " + (i - M));
			}
			countT[text.charAt(i - M)]--;
			countT[text.charAt(i)]++;
		}

		if (compare(countP, countT) == 0) {
			System.out.println("index found at " + (N - M));
		}

	}
	
	 public static void main(String args[])
	    {
	        String txt = "BACDGABCDA";
	        String pat = "ABCD";
	        AnagramSubstringSearch a = new AnagramSubstringSearch();
	        a.search(txt,pat);
	    }

}
