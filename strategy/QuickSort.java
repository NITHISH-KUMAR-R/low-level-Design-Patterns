package com.designpattern.lld.strategy;

public class QuickSort implements  SortingStrategy{
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Quick sort");
    }
}

