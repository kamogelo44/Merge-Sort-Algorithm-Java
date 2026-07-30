/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mergesort;

/**
 *
 * @author Obakeng Phale
 */
public class MergeSort {

   public static void main(String[] args) {
        // Define the array to be sorted
        int[] array = {4, 2, 6, 5, 3, 9};
        //Print the original array
        System.out.println("Original Array: ");
        for(int num :array){
       System.out.print(num + " ");
        }
        System.out.println("");
        // Call mergeSort on the entire array (from index 0 to array.length - 1)
        mergeSort(array, 0, array.length - 1);
      
        // Print the sorted array
        System.out.println("Sorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Recursive method to split and sort the array
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) { // Base case: if left index is less than right, we have more than one element
            // Find the midpoint of the current segment
            int mid = (left + right) / 2;
            
            // Recursively sort the left half
            mergeSort(array, left, mid);
            
            // Recursively sort the right half
            mergeSort(array, mid + 1, right);
            
            // Merge the sorted halves back together
            merge(array, left, mid, right);
        }
    }

    // Method to merge two sorted halves of the array
    public static void merge(int[] array, int left, int mid, int right) {
        // Calculate the sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays to hold the left and right subarrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data into the temporary arrays
        for (int i = 0; i < n1; i++)
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = array[mid + 1 + j];

        // Initialize pointers for leftArray, rightArray, and the main array
        int i = 0, j = 0, k = left;

        // Merge the temporary arrays back into the main array
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                // If element in leftArray is smaller, place it in the main array
                array[k] = leftArray[i];
                i++;
            } else {
                // If element in rightArray is smaller, place it in the main array
                array[k] = rightArray[j];
                j++;
            }
            k++; // Move to the next position in the main array
        }

        // Copy any remaining elements in leftArray (if any)
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy any remaining elements in rightArray (if any)
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
