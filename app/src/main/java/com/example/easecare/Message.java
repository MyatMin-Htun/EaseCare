package com.example.easecare;

public class Message {

    String doctor_name, address;

    // empty constructor
    public Message() {
    }

    public String getName() { return doctor_name; }

    public void setName(String name) { this.doctor_name = name; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }
}
