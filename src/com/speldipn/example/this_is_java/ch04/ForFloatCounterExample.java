package com.speldipn.example.this_is_java.ch04;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class ForFloatCounterExample {
  public static void main(String[] args) {
    for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
      System.out.println(x);
    }
    System.out.println();
    for(double x = 0.1; x <= 1.0; x += 0.1) {
      System.out.println(x);
    }

  }
}
