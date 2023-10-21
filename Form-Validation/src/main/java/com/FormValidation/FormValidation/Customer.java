package com.FormValidation.FormValidation;

import com.FormValidation.FormValidation.Validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {
    private String firstName;
    @NotNull(message = "last name must not be empty")
    @Size(min = 5 ,message="last name contain 5 to 10 characters")
    private String lastName;
    @NotNull(message = "last name must not be empty")
    @Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "must be 5 character and regualar expression")
    private String postalCode;
    @NotNull(message = "last name must not be empty")
    @Max(value = 10,message = "value must less then 10")
    @Min(value = 1,message = "value must be grater than 1")
    private String freeSpace;
    @CourseCode
    @NotNull(message = "last name must not be empty")
    private String CourseCode;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String postalCode, String freeSpace, String courseCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
        this.freeSpace = freeSpace;
        CourseCode = courseCode;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", freeSpace='" + freeSpace + '\'' +
                ", CourseCode='" + CourseCode + '\'' +
                '}';
    }
}
