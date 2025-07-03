package com.designpattern.lld.lldrealexample.vendingmachineex;

public class IdealState implements  State{
    @Override
    public void insertCoin(VendingMachine vm, int coin) {
        System.out.println("Please Insert Coin to get Drinks");
        vm.addBalance(coin);
        System.out.println("Kindly choose item for curr balance: " +coin);
        System.out.println("current balance: " +coin);
    }

    @Override
    public void selectItem(VendingMachine vm, String itemCode) {
        if(vm.getBalance()!=0){
            Item item = vm.getItem(itemCode);
            int itemPrice = item.getPrice();
            if(itemPrice <= vm.getBalance()){
                System.out.println("User Selected item "+item.getName());
                dispenseItem(vm, itemCode);
            }else{
                System.out.println("Insufficient balance please add more money ");
            }
        }

    }

    @Override
    public void dispenseItem(VendingMachine vm,String itemCode) {
        Item item = vm.getItem(itemCode);
        int returnBalance = vm.getBalance()  - item.getPrice();

        System.out.println("Item Dispensed Successfully");
        System.out.println("Returning Balance to the customer" +returnBalance);

    }
}
