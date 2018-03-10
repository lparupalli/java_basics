package com.lalitha.multilevel;

public abstract class Bird extends Animal{

    private boolean canFly;

    public Bird(String name, char gender, String color, boolean canFly){
       super(name, gender, color);
       this.canFly = canFly;
       System.out.println(" constructor with Bird");
    }

    public boolean isCanFly() {
        return canFly;
    }

}
