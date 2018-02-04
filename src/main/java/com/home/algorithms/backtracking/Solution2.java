package com.home.algorithms.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	
	public List<String> generateParenthesis(int n){
		List<String> paranthesesList = new ArrayList<String>();
		create_paranthesis ("",n,n,paranthesesList);
		return paranthesesList;
	
	}
	public void create_paranthesis (String parantheses, int openbraces_cnt, int closebraces_cnt, List<String> paranthesesList ){
		
		if(openbraces_cnt == 0 && closebraces_cnt== 0){
			paranthesesList.add(parantheses);
			return;
		}
		if(openbraces_cnt>closebraces_cnt){
			return;
		}
		if(openbraces_cnt>0){
			create_paranthesis(parantheses+"(", openbraces_cnt-1, closebraces_cnt,paranthesesList);
		}
		if(closebraces_cnt>0){
			create_paranthesis(parantheses+")", openbraces_cnt, closebraces_cnt-1,paranthesesList);
		}
	}
	
	public void printList(List<String> paranthesis){
		for(String s:paranthesis){
			System.out.println(s);
		}
		
	}
	public static void main(String args[]){
		Solution2 s =new Solution2();
		List<String>paranthesis = s.generateParenthesis(5);
		s.printList(paranthesis);
	}
}
