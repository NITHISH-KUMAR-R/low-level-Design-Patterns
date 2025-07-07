package com.designpattern.lld.interviewOops;

public final class Address {
    private final String city;
    private final String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // ✅ Copy constructor (deep copy)
    public Address(Address other) {
        this.city = other.city;
        this.state = other.state;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Address{city='" + city + "', state='" + state + "'}";
    }
}
