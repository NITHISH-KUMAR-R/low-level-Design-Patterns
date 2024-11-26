package com.designpattern.lld.strategy;

public class ClientTechniques {
    public static void main(String[] args) {
        SortingContext sort = new SortingContext(new BubbleSort());
        int array[] = {12,3,3,4};
        sort.peformSort(array);
        sort.setSortingStrategy(new QuickSort());

        sort.peformSort(array);



    }
}
