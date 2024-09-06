package org.example;

public class Vehicle {
    // We can associate different variables with objects
    // We do this by giving a variable a type and a name

    int year;
    String model;
    private String _brand;      // The Underscore prefix is a naming convention
    private String _membership; // where a variable is to be only used internally

    // We can now make get and set methods for our code:

    void set_brand(String brand){
        _brand = brand;
    }

    public String get_brand() {
        return _brand;
    }

    // Overloading

    void set_membership(String membership){
        _membership = membership;
    }

    void set_membership(Membership membership) {
        // Here we again, are declaring an object.
        // However, we do not necessarily want to create a class
        // We can instead create an enum class

        _membership = membership.name();
    }

    public enum Membership {
        Default, Silver, Gold;
    }

    String get_membership() {
        return _membership;
    }


}
