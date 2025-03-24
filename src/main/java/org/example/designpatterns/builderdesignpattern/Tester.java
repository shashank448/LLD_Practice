package org.example.designpatterns.builderdesignpattern;

public class Tester {
    public static void main(String args[]){
        User_v1.Builder builder = new User_v1.Builder(1, "Shashank");
        builder.setAge(22);
        builder.setPhoneNumber("12132324");
        User_v1 u = new User_v1(builder);

        // Now creating a object of user_v1 is too much of lines
        // we can make the changes into user_v1 and have User class

        User user = new User.Builder(1, "Shashank").age(27).phoneNumber("7860435947").build();
        // This above line has solved our problem of multiple lines
        // Also this class User have solved our problem of having multiple constructors, we havent compromised with immutability
        // as we have delegated the optional fields to inner class Builder

    }
}
