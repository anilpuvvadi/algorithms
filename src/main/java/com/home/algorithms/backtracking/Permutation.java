package com.home.algorithms.backtracking;

import java.util.HashSet;
import java.util.Set;

public class Permutation {

	public static void permutation(StringBuffer s, StringBuffer chosen,
			Set<String> alreadychosenlist) {
		if (s.toString().isEmpty() && !alreadychosenlist.contains(chosen.toString())) {
			System.out.println(chosen);
			alreadychosenlist.add(s.toString());
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			chosen = chosen.append(c);
			s = s.deleteCharAt(i);
			permutation(s, chosen, alreadychosenlist);
			chosen = chosen.deleteCharAt(chosen.length() - 1);
			s = s.insert(i, c);
		}
	}

	public static void main(String args[]){
		Permutation.permutation(new StringBuffer("ABC"), new StringBuffer(""),
					new HashSet<String>());
	}
}
