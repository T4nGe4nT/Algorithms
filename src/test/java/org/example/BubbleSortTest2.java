package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest2 {

    private BubbleSort2 bubbleSort2;

    @BeforeEach
    void setUp() {
        bubbleSort2 = new BubbleSort2();
    }

    @Test
    void sortTest2() {
        bubbleSort2.sort();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, bubbleSort2.arr);

    }


}
