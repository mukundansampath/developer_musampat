package org.home.Algos.Sort;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] input = SortUtil.getRandomArrayOfInts();
		new InsertionSort().sort(input);
	}

	private void sort(int[] input) {
		System.out.println("Input: ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+", ");
		}

		for (int i = 1; i < input.length; i++) {
			int j = i;
			while(j > 0 && input[j] < input[j-1]){
				//Swap the two numbers
				int temp = input[j];
				input[j] = input[j-1];
				input[j-1] = temp;
				j--;
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
