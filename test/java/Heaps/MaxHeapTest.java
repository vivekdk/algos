package Heaps;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxHeapTest {
    @Test
    public void heapify() throws Exception {
        Double testArr[] = {10.0, 12.0, 8.0, 11.0, 20.0, 2.0};
        MaxHeap maxHeap = new MaxHeap(testArr);
        assertTrue(compareArrays(maxHeap.getAsArray(), new Double[]{20.0, 12.0, 8.0, 10.0, 11.0, 2.0}));
        maxHeap.delete();
        assertTrue(compareArrays(maxHeap.getAsArray(), new Double[]{12.0, 2.0, 8.0, 10.0, 11.0}));
        maxHeap.delete();
        assertTrue(compareArrays(maxHeap.getAsArray(), new Double[]{11.0, 2.0, 8.0, 10.0}));
        maxHeap.delete();
        assertTrue(compareArrays(maxHeap.getAsArray(), new Double[]{10.0, 2.0, 8.0}));
    }

    @Test
    public void add() throws Exception {
        Double testArr[] = {10.0, 12.0, 8.0, 11.0, 20.0, 2.0};
        MaxHeap maxHeap = new MaxHeap(testArr);
        maxHeap.add(15.0);
        maxHeap.add(1.0);

        assertTrue(compareArrays(maxHeap.getAsArray(), new Double[]{20.0, 12.0, 15.0, 10.0, 11.0, 2.0, 8.0, 1.0}));
    }

    @Test
    public void getMaximum() throws Exception {
        Double testArr[] = {10.0, 12.0, 8.0, 11.0, 20.0, 2.0};
        MaxHeap maxHeap = new MaxHeap(testArr);
        assertTrue(20.0 == maxHeap.getMaximum().doubleValue());
    }

    @Test
    public void delete() throws Exception {
        Double testArr[] = {10.0, 12.0, 8.0, 11.0, 20.0, 2.0};
        MaxHeap maxHeap = new MaxHeap(testArr);
        maxHeap.delete();
        assertTrue(compareArrays(maxHeap.getAsArray(), new Double[]{12.0, 2.0, 8.0, 10.0, 11.0}));
    }

    private boolean compareArrays(Double[] arr1, Double[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        int size = arr1.length;
        for (int i = 0; i < size; i++) {
            if (arr1[i].doubleValue() != arr2[i].doubleValue())
                return false;
        }
        return true;
    }

}