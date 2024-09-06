package org.example;

public class Manager extends Employee {
    // Typically, if we have already declared a custom constructor:
    // We will get an error that Employee is undefined
    // We can fix this by returning the default constructor:
    // Employee () {}

    private boolean _onSite = false;

    public String equals(Employee employeeToCompare) {
        return "Overriden!";
    }

    // Getters & Setters
    void set_onSite(boolean onSiteStatus) {
        _onSite = onSiteStatus;
    }

    boolean get_onSite() {
        return _onSite;
    }
}
