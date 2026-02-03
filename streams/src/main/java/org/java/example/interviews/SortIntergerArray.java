package org.java.example.interviews;


import java.util.Arrays;

public class SortIntergerArray {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3};
        System.out.println("Original Array: " + Arrays.toString(arr));

       /* //Bubble Sort TC= O(n²) SC= O(1)
        for(int i =0; i<= arr.length-1;i++){
            for(int j=i+1;j <=arr.length-1;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];a
                    arr[j] =arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr) );
        */


        //Selection Sort  TC= O(n²)
        /*
        for(int i=0;i<=arr.length-1;i++ ){
            int minIndex = i;
            for(int j=i+1;j<= arr.length-1;j++){
                if(arr[j]< arr[minIndex])
                    minIndex=j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i]= temp;
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr) );
        */

        //Insertion Sort TC= O(n²) SC= O(1)
       /* for (int i = 1; i <= arr.length - 1; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
      */
        
    //Quick Sort TC= O(n log n) SC= O(log n)
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));    


    }

    private static void quickSort(int[] arr, int low   , int high) {
        if(low < high){
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex -1);
            quickSort(arr, pivotIndex + 1, high);
        }
        
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j <= high - 1; j++){
            if(arr[j] < pivot){
                i++;
                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

