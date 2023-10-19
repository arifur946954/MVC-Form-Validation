package com.FormValidation.FormValidation;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
    private String firstName;
    @NotNull(message = "last name must not be empty")
    @Size(min = 5 ,message="last name contain 5 to 10 characters")
    private String lastName;
    @Max(value = 10,message = "value must less then 10")
    @Min(value = 1,message = "value must be grater than 1")
    private String freeSpace;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String freeSpace) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.freeSpace = freeSpace;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(String freeSpace) {
        this.freeSpace = freeSpace;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", freeSpace='" + freeSpace + '\'' +
                '}';
    }
}
