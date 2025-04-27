package com.designpattern.lld.DesignHashMap;

public class Main {
    public static void main(String[] args) {
        OwnHashMap<Integer,String> map = new OwnHashMap<>();

        map.put(1,"Nithish");
        map.put(2,"Hello");
        map.put(3,"tata");
        map.put(1,"Kumar");
        map.put(50,"amma");
        map.put(49,"Appa");
        OwnHashMap<String,String> map2 = new OwnHashMap<>();
        map2.put("String2","hello");

        map.printTable();

        map.getValue(1);
        System.out.println(map.getValue(5));
        System.out.println(map.remove(1));
        map2.printTable();
    }
}
