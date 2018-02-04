package com.home.algorithms.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Solution3 {

	private String generateInputString(int n) {
		String pair = "()";
		String inputString = "";
		for (int i = 0; i < n; i++) {
			inputString += pair;
		}
		return inputString;
	}

	public void permutations(StringBuffer s, StringBuffer chosen,Set<String> alreadychosenlist) {
		if (s.toString().isEmpty() && !alreadychosenlist.contains(chosen.toString())) {
			alreadychosenlist.add(chosen.toString());
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			chosen = chosen.append(c);
			s = s.deleteCharAt(i);
			permutations(s, chosen, alreadychosenlist);
			chosen = chosen.deleteCharAt(chosen.length() - 1);
			s = s.insert(i, c);
		}
	}
	
	public List<String> validateParanthesis(Set<String> uniquePermset) {
		List<String> validList = new ArrayList<String>();
		Stack<Character> stack=new Stack<Character>();
		boolean invalid = false;
		for (String s : uniquePermset) {
			invalid = false;
			if (s.startsWith(")") || s.endsWith("(")) {
				continue;
			}
			char[] chararr = s.toCharArray();
			for (char c : chararr) {
				if (c == '(') {
					stack.push(c);
				} else if (c == ')') {
					if (stack.empty()) {
						invalid = true;
						break;
					} else {
						stack.pop();
					}
				}
			}
			if (stack.empty() && !invalid) {
				validList.add(s);
			}
			stack.clear();
		}
		return validList;
	}

	public void printList(List<String> paranthesis) {
		System.out.println("***Valid parantheses are listed below****");
		for (String s : paranthesis) {
			System.out.println(s);
		}
	}
	
	public List<String> generateParentheses(int n){
		String inputString = generateInputString(n);
		if (inputString.isEmpty()) {
			System.out.println("Please provide a valid number.");
			return null;
		}
		System.out.println("inputstring =>"+inputString);
		Set<String> uniquePermset = new HashSet<String>();	
		permutations(new StringBuffer(inputString), new StringBuffer(""),uniquePermset);
		List<String> valid_paranthesis_list =validateParanthesis(uniquePermset);
		return valid_paranthesis_list;
		
	}

	public static void main(String args[]) {
		Solution3 s = new Solution3();
		List<String> valid_paranthesis_list = s.generateParentheses(5);
		s.printList(valid_paranthesis_list);
	}

}