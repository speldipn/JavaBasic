package com.speldipn.example.java_ysw.ch04;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-10
 */
public class LogicOp {
  public static void main(String[] args) {
    int num1 = 10, num2 = 20;

    boolean result1 = (num1 == 10 && num2 == 20);
    boolean result2 = (num1 <= 12 || num2 >= 30);

    System.out.println("num1=10 그리고 num2==20: " + result1);
    System.out.println("num1<=12 또는 num2>=30: " + result2);

    if(!(num1 == num2)) {
      System.out.println("num1과 num2는 같지 않다.");
    } else {
      System.out.println("num1과 num2는 같다.");
    }
  }
}
