package com.speldipn.example.java_ysw.ch20;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-13
 */
public class AutoBoxingUnboxing2 {
  public static void main(String[] args) {
    Integer num1 = 10;
    Integer num2 = 20;

    num1++;
    System.out.println(num1);

    num2 += 3;
    System.out.println(num2);

    int addResult = num1 + num2;
    System.out.println(addResult);

    int minResult = num1 - num2;
    System.out.println(minResult);
  }
}
