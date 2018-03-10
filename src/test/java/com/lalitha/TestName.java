package com.lalitha;


public class TestName {

    public static void main(String[] args){
        Name na= new Name("Mahitha");
        Name na1 = new Name("Lalitha", "PARUPALLI");
        System.out.println(na.getFirstName());
        System.out.println(na.getLastName());
        System.out.println(na1.getLastName());
        System.out.println(na1.getFirstName());
    }
}
