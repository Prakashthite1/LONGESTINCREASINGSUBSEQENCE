package com.Simplilearn.LongestIncreasingSequence;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		int array[] = {10, 22, 9, 33, 21, 50, 41, 60, 80};
		
	  int arraylength = array.length;
	  
	  System.out.print("Given Arrays:");
	  for(int i=0;i<array.length;i++) {
		  System.out.print(array[i]+ " ");
	  }
	  System.out.println();
	  System.out.println("Array Size : " + arraylength);
	 
	 System.out.println("length of longest increasing subsequence:" 
	                            + longestIncSubsequence(array, arraylength)); 
	  
	}
	
	
	
	private static int longestIncSubsequence(int array[],int length) {
		
		int lis[] = new int[length];
		
	//INITALIZE THE LIS ARRAY OF THE VALUE INDEX 1	
	int i,j,max = 0;
	for(i=0;i<length;i++) {
	 lis[i]=1;
	 }
	
	//THIS NESTED LOOP COMPUTES THE VALUES IN LIS ARRAY IN BOTTOM UP MANNER
	
	for(i=1;i<length;i++) {
		for(j=0;j<i;j++) {
			if(array[i]>array[j] && lis[i]<lis[j]+1) {
				lis[i] = lis[j]+1;
			}
		}
	}
	
	//PICK UP THE MAX LENGTH OF LIS
	
	for(i=0;i<length;i++) {
		if(max<lis[i]) {
			max =lis[i];
		}
	}
	
	return max;
	
	}
	
}
