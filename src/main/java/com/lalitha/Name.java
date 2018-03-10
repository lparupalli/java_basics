package com.lalitha;

public class Name {

    private String firstName;
    private String lastName;

    public Name(String firstName){
        this.firstName= firstName;
    }

    public Name(String firstName, String lastName){
        this(firstName);
        this.lastName= lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
