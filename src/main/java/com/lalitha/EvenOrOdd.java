package com.lalitha;

public class EvenOrOdd {
    private int number;

    public EvenOrOdd(int number) {
        this.number = number;
    }

    public void check() {
        if (this.number % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

    }

    public static void main(String[] args) {
        EvenOrOdd e = new EvenOrOdd(11);
        e.check();
    }
}
