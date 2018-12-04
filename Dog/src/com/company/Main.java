package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog pepper = new Dog(10,"Pepper", "Male");
        pepper.setAge(23);

        System.out.println(pepper.getName() + " ,who is " + pepper.getGender() + ", " + "is " + pepper.getAge() + " years old!");
    }

}



