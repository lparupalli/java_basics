package com.lalitha.multilevel;

public abstract class Animal {

    private String name;
    private char gender;
    private String color;

    public Animal(String name, char gender, String color){
        this.name = name;
        this.gender = gender;
        this.color = color;
        System.out.println("Animal constructor");
    }
    public String getName(){
        return this.name;
    }
    public char getGender(){
        return this.gender;
    }

    public String getColor() {
        return this.color;
    }

    public abstract void createSound();

}
