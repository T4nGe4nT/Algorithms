package org.example;

public class QuickSort2 implements Sort{

    int[] arr = { 2, 1, 6, 10, 4, 1, 3, 9, 7};

    @Override
    public void sort() {
        quickSort2(arr, 0, arr.length - 1);

    }

    @Override
    public String sort(String arr) {
        return ""; // not needed here
    }

    public int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }

    public void quickSort2(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort2(arr, left, pivot - 1);
            quickSort2(arr, pivot + 1, right);
        }
    }

    public void printArray() {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
