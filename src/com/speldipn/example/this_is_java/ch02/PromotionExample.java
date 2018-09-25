package com.speldipn.example.this_is_java.ch02;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-25
 */
public class PromotionExample {
  public static void main(String[] args) {
    byte byteValue = 10;
    int intValue = byteValue; // byte --> int
    System.out.println(intValue);

    char charValue = '가';
    intValue = charValue;  // char --> int
    System.out.println("가의 유니코드: " + intValue);

    intValue = 500;
    long longvlaue = intValue; // int -> long
    System.out.println(longvlaue);

    intValue = 200;
    double doubleValue = intValue; // int --> double
    System.out.println(doubleValue);
  }
}
