package com.speldipn.example.this_is_java.ch04;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class ContinueExample {
  public static void main(String[] args) {
    for(int i = 1; i <= 10; ++i) {
      if(i%2 != 0) {
        continue;
      }
      System.out.println(i);
    }
  }
}
