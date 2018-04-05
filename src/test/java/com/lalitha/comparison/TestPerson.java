package com.lalitha.comparison;

public class TestPerson {
    public static void main(String[] args){
        Person p1 = new Person("JOHN ", 12,25);
        Person p2 = new Person("JOE",12,23);
        int result = p1.compareTo(p2);
        if(result < 0){
            System.out.println("John is younger than joe");
        }else if(result>0){
            System.out.println("john is elder than john");
        }else
            System.out.println("both are same age");
    }
}
