package org.home.Algos.Sort;

public class BubbleSort {
	
	public static void main(String[] args) {
		new BubbleSort().sort(SortUtil.getRandomArrayOfInts());
	}

	private void sort(int[] input) {
		
		System.out.println("Input: ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+", ");
		}
		
		for (int i = input.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(input[j] > input[j+1]){
					//Swap the two numbers
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
			System.out.print("\nEnd of step#"+(i+1)+" > ");
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
