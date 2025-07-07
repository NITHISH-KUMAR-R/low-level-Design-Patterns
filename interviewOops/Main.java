package com.designpattern.lld.interviewOops;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Chennai", "Tamil Nadu");
        List<String> skills = Arrays.asList("Java", "Spring", "Kafka");

        Employee emp = new Employee("Nithish", 101, address, skills);

        // Attempt to mutate external references
        address = new Address("Delhi", "Delhi");
        skills.set(0, "Python"); // External list mutation

        // Attempt to mutate internal state through getters
        emp.getAddress(); // You get a copy, original is safe
        emp.getSkills().add("Support Project");

        System.out.println(emp);
        System.out.println(address);
    }
}

