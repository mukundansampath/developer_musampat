package org.home.Algos.Sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] input = SortUtil.getRandomArrayOfInts();
		new SelectionSort().sort(input);
	}

	private void sort(int[] input) {
		
		System.out.println("Input: ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+", ");
		}
		
		for (int i = 0; i < input.length-1; i++) {
			
			int smallestIndex = i;
			int smallestNumber = input[i];
			
			for (int j = i+1; j < input.length; j++) {
				if(input[j] < smallestNumber){
					smallestNumber = input[j];
					smallestIndex = j;
				}
			}
			
			if(smallestIndex != i){
				//swap the numbers
				int temp = input[i];
				input[i] = smallestNumber;
				input[smallestIndex] = temp;
			}
			
			System.out.print("\nEnd of step#"+(i)+" > ");
			for (int k = 0; k < input.length; k++) {
				System.out.print(input[k]+", ");
			}
			
		}
		
		System.out.println("Output: ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+", ");
		}

	}
}
