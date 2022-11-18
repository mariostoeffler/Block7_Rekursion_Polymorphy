package Oop;

import java.util.ArrayList;

public class Customer {

    private int customerNumber;
    private ArrayList<Address> addresses = new ArrayList<>();

    public Customer(int customerNumber) {
        this.customerNumber = customerNumber;
        this.addresses = addresses;
    }

    public void addAddress(Address a) {
        addresses.add(a);

    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                '}';
    }
}
