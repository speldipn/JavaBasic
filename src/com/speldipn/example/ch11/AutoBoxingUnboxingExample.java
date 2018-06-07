package com.speldipn.example.ch11;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-15
 */
public class AutoBoxingUnboxingExample {
  public static void main(String[] args) {
    // Auto Boxing
    Integer obj1 = 100;
    System.out.println("value: " + obj1.intValue());

    // 대입 시 자동 Unboxing
    int value = obj1;
    System.out.println("value: " + value);

    // 연산 시 자동 Unboxing
    int result = obj1 + 100;
    System.out.println("result: " + result);

  }
}
