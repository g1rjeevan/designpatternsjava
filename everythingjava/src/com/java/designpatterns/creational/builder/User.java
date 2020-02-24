package com.java.designpatterns.creational.builder;

public class User {

    private final String firstName;
    private final String lastName;
    private final String phone;
    private final String address;
    private final int age;

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.phone = userBuilder.phone;
        this.address = userBuilder.address;
        this.age = userBuilder.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public static class UserBuilder {

        private String firstName;
        private String lastName;
        private String phone;
        private String address;
        private int age;


    }
}
