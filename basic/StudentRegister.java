package com.designpattern.lld.basic;

//Constructor Chaining
public class StudentRegister {
    private String studentName;
    private int age;
    private boolean sportsInterested;
    private String neetCoaching;
    private String jeeCoaching;


    public StudentRegister(String studentName,int age, boolean sportsInterested, String neetCoaching,String jeeCoaching) {
        this.age = age;
        this.neetCoaching = neetCoaching;
        this.studentName = studentName;
        this.sportsInterested = sportsInterested;
        this.jeeCoaching = jeeCoaching;
    }

    public StudentRegister( String studentName,int age,boolean sportsInterested){
        this(studentName,age,sportsInterested,"Not Interested","Not Interested");
    }
    public StudentRegister(String studentName, int age, String neetCoaching, String jeeCoaching){
        this(studentName,age,false,neetCoaching,jeeCoaching);
    }
    public StudentRegister(String studentName,int age){
        this(studentName,age,false);
    }
    @Override public String toString() { return "StudentRegister{" + "studentName='" + studentName + '\'' + ", age=" + age + ", sportsInterested=" + sportsInterested + ", neetCoaching='" + neetCoaching + '\'' + ", jeeCoaching='" + jeeCoaching + '\'' + '}'; }


}
