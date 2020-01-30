package de.kohnlehome.mergesort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
    @Test
    public void sum_65318724_should_return_12345678() {
        IMergeSort mergeSort = new MergeSort();

        int[] input = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] result = mergeSort.sort(input);

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, result);
    }
}
