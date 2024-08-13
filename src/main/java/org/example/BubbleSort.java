package org.example;

public class BubbleSort implements Sort{

    int[] arr = {4, 1, 3, 9, 7};

     @Override
    public void sort() {
         int n = arr.length; // Setting a variable to the length oif the array.
         for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - i - 1; j++) {
                 if (arr[j] > arr[j + 1]) {
                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                 }
             }
         }

    }

    @Override
    public String sort(String arr) {
        return "";
    }

    public void printArray() {
         for (int value : arr) {
             System.out.print(value + " ");
         }
         System.out.println();
    }

}
