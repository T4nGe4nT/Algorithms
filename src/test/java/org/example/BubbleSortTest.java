package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    private BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    void sortTest() {
        bubbleSort.sort(); // Sort the array
        assertArrayEquals(new int[]{1, 3, 4, 7, 9}, bubbleSort.arr); // Compare the sorted array
    }
}
