package com.speldipn.example.this_is_java.ch11;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-15
 */
public class MathRandomExample {
  public static void main(String[] args) {
    for(int i = 0; i < 10; ++i) {
      System.out.println((int) (Math.random() * 6 + 1));
    }
  }
}
