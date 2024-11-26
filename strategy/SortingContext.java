package com.designpattern.lld.strategy;

public class SortingContext{
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public SortingContext(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }



    public void peformSort(int[] array) {
        sortingStrategy.sort(array);

    }
}
