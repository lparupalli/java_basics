package com.lalitha;

public class SumOfDigits {
    private int num;
    private int sum;
public SumOfDigits(int num){
    this.num= num;
    this.sum = sum;
}
public int add() {
    while(this.num>0){
        sum = sum + this.num % 10;
        this.num = this.num / 10;
    }
    return sum;
}
public static void main(String[] args){
        SumOfDigits s = new SumOfDigits(123);
        int num1 = s.add();
        System.out.println(num1);
    }
}


