package com.speldipn.example.this_is_java.ch02;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-25
 */
public class CastingExample {
  public static void main(String[] args) {
    int intValue = 44032;
    char charValue = (char) intValue;
    System.out.println(charValue);

    long longValue = 500;
    intValue = (int) longValue;
    System.out.println(intValue);

    double doubeValue = 3.14;
    intValue = (int) doubeValue;
    System.out.println(intValue);
  }
}
