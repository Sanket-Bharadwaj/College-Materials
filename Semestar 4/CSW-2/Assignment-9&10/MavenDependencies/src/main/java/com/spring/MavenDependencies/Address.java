package com.spring.MavenDependencies;

public class Address {
    private int houseNumber;
    private String city;
    private int pinCode;

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "House Number: " + houseNumber + ", City: " + city + ", Pin Code: " + pinCode;
    }
}
