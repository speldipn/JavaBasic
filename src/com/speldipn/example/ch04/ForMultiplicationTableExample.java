package com.speldipn.example.ch04;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class ForMultiplicationTableExample {
  public static void main(String[] args) {
    for(int m = 2; m <= 9; ++m) {
      System.out.println("*** " + m + "단 ***");
      for(int n = 1; n <= 9; ++n) {
        System.out.println(m + " x " + n + " = " + (m*n));
      }
    }
  }
}
