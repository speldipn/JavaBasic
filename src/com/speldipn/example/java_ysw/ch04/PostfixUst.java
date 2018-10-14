package com.speldipn.example.java_ysw.ch04;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-10
 */
public class PostfixUst {
  public static void main(String[] args) {
    int num1 = 7, num2;
    num2 = (num1--) + 5;
    System.out.println("num1: " + num1);
    System.out.println("num2: " + num2);
  }
}

