package arete.example.java.demo;

import arete.example.kotlin.O1clazz.Customer;

public class SomethingInJava {
    public static void main(String[] args) {
        Customer customer = new Customer("Ravi",  "Hasija", 25);
        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getAge());
    }
}
