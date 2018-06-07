package com.speldipn.example.this_is_java.ch04;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class ForSumFrom1To100Example {
  public static void main(String[] args) {
    int sum = 0;
    for(int i = 0; i <= 100; ++i) {
      sum += i;
    }

    System.out.println("1-100 sum: " + sum);
  }
}
