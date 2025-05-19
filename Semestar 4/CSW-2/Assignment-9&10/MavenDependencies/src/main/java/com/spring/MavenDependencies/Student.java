package com.spring.MavenDependencies;

public class Student {
    private int rollNumber;
    private String name;
    private Address addr;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }
    

    public void display() {
    	System.out.println("Name: "+name+" \nRollNo: "+rollNumber+" \nAddress: "+addr.toString());
       
    }
}
