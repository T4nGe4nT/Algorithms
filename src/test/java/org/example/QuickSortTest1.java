package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest1 {

     private QuickSort1 quickSort1;

     @BeforeEach
    void setUp() {
         quickSort1 = new QuickSort1();
     }

     @Test
    void sortQuickTest() {
         quickSort1.sort();
         assertArrayEquals(new int[]{1, 3, 4, 7, 9}, quickSort1.arr);
     }
}
