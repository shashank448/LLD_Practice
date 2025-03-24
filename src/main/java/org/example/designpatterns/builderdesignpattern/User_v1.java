package org.example.designpatterns.builderdesignpattern;

public class User_v1 {
    private final int id;
    private final String name;
    private final String phoneNumber;
    private final int age;

    public User_v1(Builder builder){
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

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
