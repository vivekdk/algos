package Heaps;

import java.util.NoSuchElementException;

/**
 * Created by vivekdk on 12/06/17.
 */
public class MaxHeap extends Heap {

    public MaxHeap(Double[] heap) {
        super(heap);
    }

    @Override
    protected void heapify(int current) {
        try {
            int left = leftChild(current);
            int right = rightChild(current);

            int min = -1;
            if (this.heap.get(left) > this.heap.get(current))
                min = left;

            if (min == -1 && this.heap.get(right) > this.heap.get(current))
                min = right;

            if (min != -1) {
                Double temp = this.heap.get(min);
                this.heap.set(min, this.heap.get(current));
                this.heap.set(current, temp);
                min = current;
                heapify(min);
            }
        } catch (NoSuchElementException e) {

        }
    }

    public boolean add(Double num) {
        this.heap.add(num);
        if (size() == 1)
            return true;

        int current = size() -1;
        int parent = parent(current);
        while (this.heap.get(current) > this.heap.get(parent)) {
            Double temp = this.heap.get(parent);
            this.heap.set(parent, this.heap.get(current));
            this.heap.set(current, temp);

            current = parent;
            parent = parent(current);
        }
        return true;
    }

    public Double getMaximum() {
        return this.heap.get(0);
    }

    @Override
    public Double delete() {
        Double deletedVal = this.heap.get(0);
        this.heap.set(0, this.heap.get(size() - 1));
        this.heap.remove(size() - 1);
        heapify(0);
        return deletedVal;
    }
}
