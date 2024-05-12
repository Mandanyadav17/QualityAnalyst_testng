package corejavabasics;

import java.util.Arrays;

public class Remove_elemnt_fromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // Original Array
        int[] A = { 1, 2, 3, 4, 5, 6 };
        //int[] A = { 1, 2, 3, 4, 5, 6 };
       
        System.out.println("Original Array : " + Arrays.toString(A));
        
        // Index at which the element will be removed
        int p = 2;
        
        int lenthindex= A.length;
        
        // New Array of size -1 of the original array
        int[] B = new int[lenthindex - 1];
//System.out.println(Arrays.toString(B));
        
        // Copy elements before the index
        for (int i = 0; i < p; i++) {
            B[i] = A[i];
        }
        
        // Copy elements after the index
        for (int i = p + 1; i < A.length; i++) {
            B[i - 1] = A[i];
        }
        
        // Printing the new Array
        System.out.print("New Array : " + Arrays.toString(B));
    }

}
