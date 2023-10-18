package com.FormValidation.FormValidation;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
    private String firstName;
    @NotNull(message = "last name must not be empty")
    @Size(max = 20,min = 5,message="last name contain 5 to 10 characters")
    private String lasrName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasrName() {
        return lasrName;
    }

    public void setLasrName(String lasrName) {
        this.lasrName = lasrName;
    }
}
