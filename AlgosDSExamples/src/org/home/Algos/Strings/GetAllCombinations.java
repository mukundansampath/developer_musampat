package org.home.Algos.Strings;

import java.util.ArrayList;
import java.util.List;

public class GetAllCombinations {

	public static void main(String[] args) {
		List<String> combs = new GetAllCombinations().getAllCombinations("ABCDE");
		System.out.println("All combinations: ");
		for (String string : combs) {
			System.out.print("\""+string+"\" ,");
		}
		
	}

	private List<String> getAllCombinations(String string) {
		List<String> combs = new ArrayList<String>();
		combs.add("");
		getAllCombinations(string, 0, combs);
		return combs;
	}

	private void getAllCombinations(String string, int i, List<String> combs) {
		
		if(i == string.length()){
			return;
		}
		
		List<String> newCombs = new ArrayList<String>();
		for (String string1 : combs) {
			newCombs.add(string1 + string.charAt(i));
		}
		combs.addAll(newCombs);
		
		getAllCombinations(string, ++i, combs);
	}


}
