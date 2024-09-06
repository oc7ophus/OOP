package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // The whole point of objects is creating new types, for example: User u
        // The way you create an object is to create a "new" object

        debugSOUT("Basics");

        Vehicle miata = new Vehicle();

        // This "Vehicle" object is stored in the variable "miata"
        // When we declare this variable with: new Vehicle();
        // This is known as a Constructor.
        // We are invoking the *default constructor* for this Vehicle class

        miata.model = "MX-5";
        miata.year = 1993;

        // Once we have added getter and setters:
        // miata.brand = "Mazda";
        // Would change to:
        miata.set_brand("Mazda");
        System.out.println(miata.get_brand());

        // Overloading is when you want a method to accept more than one type input

        miata.set_membership("Gold");
        System.out.println(miata.get_membership());

        // Once we create our enum, we can access our enum directly

        miata.set_membership(Vehicle.Membership.Default);
        System.out.println(miata.get_membership());



        // Constructors
        debugSOUT("Constructors");

        Fruit orange = new Fruit("Orange", "Sunny Sweet");
        System.out.println(orange.getFruitVariety() + " " + orange.getTradeMarkName());

        // We can declare objects in this way when we require certain things to create a fruit
        // i.e, a fruit may not be valid without a variety
        // This is a way to force that data to be required using a constructor

        // Also, we can no longer use the empty constructor (as it no longer exists by default):
        // Fruit banana = new Fruit();

        // Method overriding
        debugSOUT("Method Overriding");

        Fruit strawberry = new Fruit("Strawberry", "Squishy Red");
        System.out.println(strawberry);
        // Unchanged, this would simply output the value describing the type and memory address:
        // org.example.Fruit@3d494fbf

        Fruit blueberry = new Fruit("Blueberry", "Rocky Sour");
        System.out.println(blueberry);
        // However, we can Override String toString()

        // Similarly, another useful function is checking if objects are equal:
        Fruit blueberry2 = blueberry;
        System.out.println(blueberry.equals(blueberry2));
        // Normally, this will compare the objects and return a bool
        // However, we may instead want to compare the values associated



        // Generic Types
        debugSOUT("Generic Types");

        List<Fruit> fruits = new ArrayList<Fruit>();
        // These types don't match, as on the left we have an Interface; List
        // While on the right, we have an Implementation; ArrayList
        // Sidenote: You can also use ArrayList on the left-hand side

        fruits.add(strawberry);
        System.out.println(fruits.get(0).getFruitVariety() + " " + fruits.get(0).getTradeMarkName());

        fruits.add(new Fruit("Pineapple", "Prickly King"));
        System.out.println(fruits.get(1).getFruitVariety() + " " + fruits.get(1).getTradeMarkName());

        // We can now also use a For Each loop
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getFruitVariety());
        }



        // Static Data Members
        debugSOUT("Static Data Members");

        Employee jerry = new Employee("Jerry Smith", "gloob@info.org");

        // Now that we have declared a static list of supervisors:
        // public static List<Employee> supervisors;
        // We can create an ArrayList like so:

        Employee.supervisors = new ArrayList<>();

        Employee.supervisors.add(jerry);
        Employee.supervisors.add(new Employee("Terry Davis", "glimp@hoot.fun"));

        for (Employee employee : Employee.supervisors) {
            System.out.println(employee.get_name() + " " + employee.get_email());
        }



        // Static Methods
        debugSOUT("Static Methods");

        // Let's say for example, we would like to use the loop above to display supervisors
        // instead of WET, DRY!

        Employee.display_supervisors();



        // Inheritance
        debugSOUT("Inheritance");

        Manager james = new Manager();
        System.out.println(james.get_onSite());
        System.out.println(james.get_name());

        james.set_onSite(true);
        System.out.println(james.get_onSite());
        System.out.println();

        // We can also Method Override exclusively for custom classes this way!
        System.out.println(james.equals(jerry));
        System.out.println(jerry.equals(james));



        // Polymorphism
        debugSOUT("Polymorphism");

        Intern frank = new Intern();
        System.out.println(frank.get_name() + " " + frank.get_email());

    }

    private static void debugSOUT(String stringInput) {
        System.out.println("\n DEBUG: " + stringInput + "\n");
    }
}