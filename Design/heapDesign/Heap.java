package com.designpattern.lld.Design.heapDesign;

public interface Heap<T> {
    public void add(T element);
    public boolean isEmpty();
    public T peek();
}
