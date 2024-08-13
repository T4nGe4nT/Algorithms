package org.example;

public class Main {
    public static void main(String[] args) {

        // Bubble Sort
        BubbleSort bubbleSort1 = new BubbleSort();
        System.out.println("Array before sorting:");
        bubbleSort1.printArray();
        bubbleSort1.sort();
        System.out.println("Array after sorting:");
        bubbleSort1.printArray();

        // Bubble Sort 2

        BubbleSort2 bubbleSort2 = new BubbleSort2();
        System.out.println("Array before sorting:");
        bubbleSort2.printArray();
        bubbleSort2.sort();
        System.out.println("Array after sorting:");
        bubbleSort2.printArray();


        // Quick Sort 1

        QuickSort1 quickSort = new QuickSort1();
        System.out.println("Array before sorting:");
        quickSort.printArray();
        quickSort.sort();
        System.out.println("Array after sorting:");
        quickSort.printArray();

        //Quick Sort 2

        QuickSort2 quickSort2 = new QuickSort2();
        System.out.println("Array before sorting:");
        quickSort2.printArray();
        quickSort2.sort();
        System.out.println("Array after sorting:");
        quickSort2.printArray();


        // Count Sort 1

        Sort countSort1 = new CountSort1();

        String input = "edsab";
        String output = countSort1.sort(input);

        System.out.println("Input: " + input);
        System.out.println("Sorted Output: " + output);
    }
}




