package com.designpattern.lld.lldrealexample.vendingmachineex;

public interface State {
     void insertCoin(VendingMachine vm,int coin);
     void selectItem(VendingMachine vm, String itemCode);
     void dispenseItem(VendingMachine vm,String itemCode);
}
