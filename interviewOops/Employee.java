package com.designpattern.lld.interviewOops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Employee {
    private final String name;
    private final int id;
    private final Address address;
    private final List<String> skills;

    public Employee(String name, int id, Address address, List<String> skills) {
        this.name = name;
        this.id = id;
        //this.address = address;
        // ✅ Deep copy for mutable object
        //this.address = address;
        this.address = new Address(address);
        // ✅ Deep copy for mutable collection
        this.skills = new ArrayList<>(skills);
    }

    // ✅ Only getters - no setters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Address getAddress() {
        return new Address(address); // ✅ Defensive copy
    }

    public List<String> getSkills() {
        return new ArrayList<>(skills); // ✅ Return a copy
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + '\'' +
                ", id=" + id +
                ", address=" + address +
                ", skills=" + skills + '}';
    }
}
