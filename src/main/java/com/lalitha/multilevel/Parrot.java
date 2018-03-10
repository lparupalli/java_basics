package com.lalitha.multilevel;

public final class Parrot extends Bird{

    public Parrot(String name, char gender, String color, boolean canFly) {
        super(name, gender, color, canFly);
        System.out.println(" constructor with parrot");
    }

    @Override
    public void createSound(){

        System.out.println("ku ku ku");
    }

}
