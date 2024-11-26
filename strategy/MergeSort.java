package com.designpattern.lld.strategy;

public class MergeSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Merge sort");
    }
}
