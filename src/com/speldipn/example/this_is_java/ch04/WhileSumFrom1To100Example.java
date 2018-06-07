package com.speldipn.example.this_is_java.ch04;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class WhileSumFrom1To100Example {
  public static void main(String[] args) {
    int sum = 0;
    int i = 1;
    while(i<=100) {
      sum += i;
      ++i;
    }

    System.out.println("1~" + (i-1) + " 합 : " + sum);
  }
}
