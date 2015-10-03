package org.home.Algos.Sort;

import java.util.Random;

public class SortUtil {
	
	public static int[] getRandomArrayOfInts(){
		
		int[] randomInts = new int[16];
		Random randomIntgen = new Random();
		
		for (int i = 0; i < randomInts.length; i++) {
			randomInts[i] = randomIntgen.nextInt(1000);
		}
 
		return randomInts;
		
	}

}
