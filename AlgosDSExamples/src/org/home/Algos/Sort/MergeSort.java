package org.home.Algos.Sort;

import java.util.ArrayList;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] input = SortUtil.getRandomArrayOfInts();
		new MergeSort().sort(input);
	}

	private void sort(int[] input) {
		System.out.println("Input: ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+", ");
		}
		
		int[] output = new int[input.length];
		
		int mergeWindowSize = 1;

		while(mergeWindowSize <= input.length/2 ){

			if(mergeWindowSize > 1){
				for (int i = 0; i < input.length; i++) {
					input[i] = output[i];
				}
			}
			
			int outputIndex = 0;
			int leftWindowIndex = 0; 
			int rightWindowIndex = mergeWindowSize;
			
			while(outputIndex < input.length){
				int leftWidowCounter = 0;
				int rightWindowCounter = 0;
				
				//Merge the adjacent windows of size mergeWindowSize until the very end
				while(leftWidowCounter < mergeWindowSize || rightWindowCounter < mergeWindowSize){
					if(leftWidowCounter == mergeWindowSize){
						//Fill up the output buffer with right window elements
						output[outputIndex++] = input[rightWindowIndex++];
						rightWindowCounter++;
					}
					else if(rightWindowCounter == mergeWindowSize){
						//Fill up the in[ut buffer with left window elements
						output[outputIndex++] = input[leftWindowIndex++];
						leftWidowCounter++;
					}
					else{
						//Populate the output buffer
						if(input[leftWindowIndex] > input[rightWindowIndex]){
							output[outputIndex++] = input[rightWindowIndex++];
							rightWindowCounter++;
						}
						else{
							output[outputIndex++] = input[leftWindowIndex++];
							leftWidowCounter++;
						}
					}
				}
				
				leftWindowIndex = rightWindowIndex;
				rightWindowIndex += mergeWindowSize;
				
			}
			
			System.out.print("\nEnd of Merge step > ");
			for (int k = 0; k < output.length; k++) {
				System.out.print(output[k]+", ");
			}
			mergeWindowSize *= 2;
		}
		
		System.out.println("\nOutput: ");
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]+", ");
		}
		
	}

}
