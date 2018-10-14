package com.speldipn.example.java_ysw.ch04;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-10
 */
public class ArithOp {
  public static void main(String[] args) {
    int n1 = 7;
    int n2 = 3;

    int result = n1 + n2;
    System.out.println("plus: " + result);

    result = n1 - n2;
    System.out.println("minus: " + result);
    System.out.println("multiple: " + n1 * n2);
    System.out.println("divide: " + n1 / n2);
    System.out.println("modulo: " + n1 % n2);
  }
}
