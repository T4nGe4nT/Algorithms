package org.example;

public class QuickSort1 implements Sort {

    int[] arr = {4, 1, 3, 9, 7};

    @Override
    public void sort() {
        quickSort(arr, 0, arr.length - 1);
    }

    @Override
    public String sort(String arr) {
        return "";
    }

    public int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[right] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }

    public void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    // A method to print the array
    public void printArray() {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
