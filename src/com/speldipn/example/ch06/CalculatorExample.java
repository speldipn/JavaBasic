package com.speldipn.example.ch06;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class CalculatorExample {
  public static void main(String[] args) {
    Calculator myCalc = new Calculator();

    double result1 = myCalc.areaRectangle(10);
    System.out.println("result1 : " + result1);

    double result2 = myCalc.areaRectangle(10, 20);
    System.out.println("result2 : " + result2);

  }
}
