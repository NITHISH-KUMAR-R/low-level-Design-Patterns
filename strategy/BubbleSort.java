package com.designpattern.lld.strategy;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Bubble Sort ");
    }
}

