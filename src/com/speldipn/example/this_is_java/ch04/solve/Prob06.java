package com.speldipn.example.this_is_java.ch04.solve;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class Prob06 {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("프로그램 종료.");
  }
}
