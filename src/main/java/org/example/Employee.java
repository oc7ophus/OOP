package org.example;

import java.util.List;

public class Employee {

    private String _name = "DEFAULT_NAME";
    private String _email = "DEFAULT_EMAIL";

    private int _age = -1;
    private int _id = -1;

    public static List<Employee> supervisors;

    public static void display_supervisors() {
        for (Employee employee : supervisors) {
            System.out.println(employee.get_name());
        }
    }

    // Constructors
    Employee (String name, String email) {
        _name = name;
        set_email(email);
    }

    Employee () {}

    // Getters & Setters
    String get_name() {
        return _name;
    }

    String get_email() {
        return _email;
    }

    void set_email(String email) {
        _email = email;
    }
}
