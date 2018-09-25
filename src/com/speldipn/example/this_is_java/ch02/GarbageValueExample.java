package com.speldipn.example.this_is_java.ch02;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-25
 */
public class GarbageValueExample {
  public static void main(String[] args) {
    byte var1 = 125;
    int var2 = 125;

    for (int i = 0;i < 5; ++i) {
      ++var1;
      ++var2;
      System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
    }
  }
}
