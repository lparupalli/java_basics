package com.lalitha.overLoading;

public  class ClassB implements InterfaceA{

    public String methodOne(){
        return "LALITHA";
    }

    public String methodOne(int a){
        return "Lalitha "+a;
    }
}
