package com.lalitha;

public class Employee {
    protected int salary = 40000;
}
class Employee1 extends Employee{
    int bonus = 1000;
    public static void main(String[] args){
        Employee1 e  = new Employee1();
         int s = e.salary;
         int b = e.bonus;
    System.out.println(s);
    System.out.println(b);
    }
}
