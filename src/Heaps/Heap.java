package Heaps;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Created by vivekdk on 12/06/17.
 */
public abstract class Heap {
    protected ArrayList<Double> heap = new ArrayList<>();

    public Heap() {
    }

    public Heap(Double[] heap) {
        for (Double d : heap){
            add(d);
        }
    }

    protected int size(){
        return this.heap.size();
    }

    protected int leftChild(int i) throws NoSuchElementException{
        int left = (2 * i) + 1;
        if (left > size())
            throw new NoSuchElementException("No left child for this node");
        return left;
    }

    protected int rightChild(int i) throws NoSuchElementException{
        int right = (2 * i) + 2;
        if (right > size())
            throw new NoSuchElementException("No right child for this node");
        return right;
    }

    protected int parent(int i) throws NoSuchElementException{
        int parent = (i-1) / 2;
        if (parent < 0)
            throw new NoSuchElementException("No parent child for this node. Must be root");
        return parent;
    }

    protected abstract boolean add(Double num);

    protected abstract void heapify(int current);

    protected abstract Double delete();

    public Double [] getAsArray(){
        Double [] d = new Double [size()];
        for (int i =0; i < size(); i++)
            d[i] = this.heap.get(i);
        return d;
    }

    @Override
    public String toString() {
        return "Heap{" +
                "heap=" + heap +
                '}';
    }
}
