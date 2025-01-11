package com.designpattern.lld.basic;

public class ConstructorExample {
    private String name;
    private int age;
    ConstructorExample( ){
    }
    ConstructorExample(String name){
        this.name= name;
    }
    ConstructorExample(int age){
        this.age= age;
    }
    public static void main(String[] args) {

        ConstructorExample obj = new ConstructorExample("Nithis");
        System.out.println(obj.name);
        System.out.println(obj.age);

        StudentRegister st1 = new StudentRegister("Nithis",23,true,"yes","yes");
        System.out.println(st1);
        StudentRegister st2 = new StudentRegister("Sobiya",23,false,"Yes","Yes");
        System.out.println(st2);
        StudentRegister st3 = new StudentRegister("Dinesh",23);
        System.out.println(st3);
    }
}
