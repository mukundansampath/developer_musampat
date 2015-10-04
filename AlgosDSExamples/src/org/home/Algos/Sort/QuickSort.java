package org.home.Algos.Sort;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] input = SortUtil.getRandomArrayOfInts();
		
		System.out.println("Input: ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+", ");
		}

		int[] output = new QuickSort().sort(input, 0, input.length-1);
		
		System.out.println("\noutput: ");
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]+", ");
		}
	}

	private int[] sort(int[] input, int start, int end) {

		//Base case
		if(end-start <= 0){
			return input;
		}

		int pivot = (start+end)/2;

		int leftWindowIndex = start;
		int rightWindowIndex = end;
		
		while(leftWindowIndex <= pivot && rightWindowIndex >= pivot){
			
			while(input[leftWindowIndex] < input[pivot]){
				leftWindowIndex++;
			}
			while(input[rightWindowIndex] > input[pivot]){
				rightWindowIndex--;
			}
			
			if(leftWindowIndex == rightWindowIndex){
				break;
			}
			
			if(leftWindowIndex <= pivot || rightWindowIndex >= pivot){
				
				if(input[leftWindowIndex] == input[pivot]){
					pivot = rightWindowIndex;
				}
				else if(input[rightWindowIndex] == input[pivot]){
					pivot = leftWindowIndex;
				}

				//swap the 2 numbers
				int temp = input[leftWindowIndex];
				input[leftWindowIndex] = input[rightWindowIndex];
				input[rightWindowIndex] = temp;

				//Reset the left and right window indexes
				leftWindowIndex = start;
				rightWindowIndex = end;

			}
		}

		System.out.print("\nAt the end of sort step >");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+", ");
		}
		
		//Iteratively sort the left and right windows
		sort(input, start, pivot-1);
		int[] finalSortedArray = sort(input, pivot+1, end);
		
		return finalSortedArray;
	}

}
