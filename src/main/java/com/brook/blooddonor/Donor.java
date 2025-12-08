package com.brook.blooddonor;

import jakarta.validation.constraints.*;

public class Donor {



    @NotNull(message = "Name is required")
    @NotBlank(message = "Name is required")
    @Size(min=2,max=50, message="Name must be at least 2 characters")




    private String FirstName;

    @Min(value =0, message = "Age must be a positive number")
    @Max(value =130,message = "Age must be 130 or less")
    int age;

    @Min(value =5, message="Weight must be at least 5")
    @Max(value = 600,message = "Weight must be 600 lbs or less")
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
