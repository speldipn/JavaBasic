package com.speldipn.example.this_is_java.ch04.solve;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class Prob05 {
  public static void main(String[] args) {
    for(int i = 1; i <= 10; ++i) {
      for(int j = 1; j <= 10; ++j) {
        if((4*i)+(5*j) == 60) {
          System.out.println("(" + i + ", " + j + ")");
        }
      }
    }
    System.out.println("프로그램 종료.");
  }
}
