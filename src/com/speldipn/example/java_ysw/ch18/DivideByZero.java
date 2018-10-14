package com.speldipn.example.java_ysw.ch18;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-11
 */
public class DivideByZero {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("input two numbers: ");
    int a = in.nextInt();
    int b = in.nextInt();
    int result;
    try {
      result = a / b;
    } catch(ArithmeticException e) {
      System.out.println("Exception ! : " + e.getMessage());
      result = 0;
    }
    System.out.println("Result : " + result);
  }
}
