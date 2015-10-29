package org.home.Algos.Strings;

public class MaximumLengthPrefix {
	
	public static void main(String[] args) {
		String output = new MaximumLengthPrefix().getMaximumLengthPrefix(
				new String[]{"I am great", "I am cool", "I am the boss"}
				);
		
		System.out.println("Max Prefix is: "+output);
	}

	private String getMaximumLengthPrefix(String[] input) {
		
		if(input.length == 0){
			return "";
		}

		String maxPref = "";
		
		for (int i = 0; i < input[0].length(); i++) {
			char currentChar = input[0].charAt(i);
			
			for (int j = 1; j < input.length; j++) {
				if(input[j].charAt(i) != currentChar){
					return maxPref;
				}
				
			}
			maxPref += currentChar;
		}
		return input[0];
	}

}
