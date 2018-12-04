package com.company;

public class Dog {

    private int age;
    private String name;
    private String gender;

    public Dog(int dogAge, String dogName, String dogGender) {
        this.age = dogAge;
        this.name = dogName;
        this.gender = dogGender;
    }

    public void setAge(int dogAge) {
        this.age = dogAge;
    }

    public void setName(String dogName) {
        this.name = dogName;
    }

    public void setGender(String dogGender) {
        this.name = dogGender;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }
}
