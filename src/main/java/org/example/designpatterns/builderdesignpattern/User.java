package org.example.designpatterns.builderdesignpattern;


// Created another version of User
// In this class, I have made the changes as per required builder pattern
public class User {
    private final int id;
    private final String name;
    private final String phoneNumber;
    private final int age;

    private User(Builder builder){   // making the constructor private as this is not being invoked from outside
        this.id = builder.id;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.age = builder.age;
    }

    public static class Builder{
        private final int id;
        private final String name;
        // These are optional fields, we have compromised immutability in this inner class
        // instead of main class (User)
        private String phoneNumber;
        private int age;
        public Builder(int id, String name){
            this.id = id;
            this.name = name;
        }

        public Builder phoneNumber(String phoneNumber) {    // renamed the setter setPhoneNumber to phoneNumber as this is more intuitive
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public User build(){
            User user = new User(this);
            return user;
        }
    }
}

