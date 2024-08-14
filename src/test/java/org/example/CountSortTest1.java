package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSortTest1 {

    private CountSort1 countSort1;

    @BeforeEach
    void setUp() {
        countSort1 = new CountSort1();

    }

    @Test
    void sortCountTest() {
        countSort1.sort();
        assertEquals("abdes", countSort1.sort("edsab"));
    }
}
