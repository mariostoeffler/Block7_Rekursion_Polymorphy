package Oop;

public class Demo {

    public static void main(String[] args) {
        Customer c = new Customer(1);
        Customer c2 = new Customer(2);
        c.addAddress(new Address("Lagestraße","34234", "Graz", "Austria"));
    }
 }
