package Heaps;

import Heaps.MaxHeap;
import Heaps.MinHeap;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MinHeapTest {

    @Test
    public void heapify() throws Exception {
        Double testArr[] = {10.0, 12.0, 8.0, 11.0, 20.0, 2.0};
        MinHeap minHeap = new MinHeap(testArr);
        assertTrue(compareArrays(minHeap.getAsArray(), new Double[]{2.0, 11.0, 8.0, 12.0, 20.0, 10.0}));
        minHeap.delete();
        assertTrue(compareArrays(minHeap.getAsArray(), new Double[]{8.0, 11.0, 10.0, 12.0, 20.0}));
        minHeap.delete();
        assertTrue(compareArrays(minHeap.getAsArray(), new Double[]{10.0, 20.0, 11.0, 12.0}));
        minHeap.delete();
        assertTrue(compareArrays(minHeap.getAsArray(), new Double[]{11.0, 20.0, 12.0}));
    }

    @Test
    public void initArray() throws Exception {
        Double testArr[] = {10.0, 12.0, 8.0, 11.0, 20.0, 2.0};
        MinHeap minHeap = new MinHeap(testArr);
        assertTrue(compareArrays(minHeap.getAsArray(), new Double[]{2.0, 11.0, 8.0, 12.0, 20.0, 10.0}));
    }

    @Test
    public void add() throws Exception {
        Double testArr[] = {10.0, 12.0, 8.0, 11.0, 20.0, 2.0};
        MinHeap minHeap = new MinHeap(testArr);
        minHeap.add(15.0);
        minHeap.add(1.0);

        assertTrue(compareArrays(minHeap.getAsArray(), new Double[]{1.0, 2.0, 8.0, 11.0, 20.0, 10.0, 15.0, 12.0}));
    }

    @Test
    public void getMinimum() throws Exception {
        Double testArr[] = {10.0, 12.0, 8.0, 11.0, 20.0, 2.0};
        MinHeap minHeap = new MinHeap(testArr);
        assertTrue(2.0 == minHeap.getMinimum().doubleValue());
    }

    @Test
    public void delete() throws Exception {
        Double testArr[] = {10.0, 12.0, 8.0, 11.0, 20.0, 2.0};
        MinHeap minHeap = new MinHeap(testArr);
        minHeap.delete();
        assertTrue(compareArrays(minHeap.getAsArray(), new Double[]{8.0, 11.0, 10.0, 12.0, 20.0}));
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