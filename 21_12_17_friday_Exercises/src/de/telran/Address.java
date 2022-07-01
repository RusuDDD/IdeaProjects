package de.telran;

public class Address {
    private String address;
    private int numbers;

    public Address(String address, int numbers) {
        this.address = address;
        this.numbers = numbers;
    }

    public String getAddress() {
        return address;
    }

    public int getNumbers() {
        return numbers;
    }
}
