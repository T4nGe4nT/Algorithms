package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest2 {

    private QuickSort2 quickSort2;

    @BeforeEach
    void setUp() {
        quickSort2 = new QuickSort2();
    }

    @Test
    void sortQuickTest2() {
        quickSort2.sort();
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 6, 7, 9, 10}, quickSort2.arr);
    }
}
