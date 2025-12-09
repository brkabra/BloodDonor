package com.brook.blooddonor;

import jakarta.validation.constraints.*;

public class Donor {

    // First name field with multiple validation rules:
    // @NotNull makes sure the field isn't missing entirely
    // @NotBlank ensures the user actually typed something (not just spaces)
    // @Size prevents names that are too short or too long
    @NotNull(message = "Name is required")
    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 50, message = "Name must be at least 2 characters")
    private String FirstName;

    // Age field validation:
    // @Min ensures age cannot go below 0
    // @Max prevents unrealistic ages over 130
    @Min(value = 0, message = "Age must be a positive number")
    @Max(value = 130, message = "Age must be 130 or less")
    int age;

    // Weight field validation:
    // @Min ensures the weight can't be extremely low
    // @Max prevents unrealistic high values
    @Min(value = 5, message = "Weight must be at least 5")
    @Max(value = 600, message = "Weight must be 600 lbs or less")
    int weight;


    public Donor() {}


    public String getFirstName() {
        return FirstName;
    }


    public void setFirstName(String firstName) {
        FirstName = firstName;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public int getWeight() {
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }
}
