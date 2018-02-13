package com.lalitha;

public class Fibonacci {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;
    private int febCount;
public Fibonacci(int firstNumber, int secondNumber, int febCount){
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.febCount = febCount;
}
public int[] generateSeries(){
    int[] arr = new int[this.febCount];
    arr[0] = this.firstNumber;
    arr[1] = this.secondNumber;
  for(int i=2; i<this.febCount;i++) {
      this.thirdNumber = this.firstNumber + this.secondNumber;
      arr[i] = this.thirdNumber;
      this.firstNumber = this.secondNumber;
      this.secondNumber = this.thirdNumber;
  }
      return arr;

}
public static void main(String[] args){
    Fibonacci feb = new Fibonacci(0,1,20);
    int[] arr = feb.generateSeries();
   for(int i=0; i<arr.length;i++){
       System.out.println(arr[i]);
   }
}
}
