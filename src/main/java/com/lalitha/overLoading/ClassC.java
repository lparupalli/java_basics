package com.lalitha.overLoading;

public class ClassC extends ClassA{

    @Override
    public String method1(){
        return "MAHITHA";
    }

    public String method1(int a){
        return "Mahitha " +a;
    }
}

