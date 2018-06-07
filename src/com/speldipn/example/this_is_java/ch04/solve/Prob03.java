package com.speldipn.example.this_is_java.ch04.solve;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class Prob03 {
  public static void main(String[] args) {
    int sum = 0;
    for(int i = 1; i <= 100; ++i) {
      if (i % 3 == 0) {
        sum += i;
      }
    }
    System.out.println("Total : " + sum);
  }
}
