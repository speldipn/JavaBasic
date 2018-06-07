package com.speldipn.example.ch11;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-12
 */
public class FinalizeExample {
  public static void main(String[] args) {
    Counter counter = null;
    for(int i = 0; i <= 50; ++i) {
      counter = new Counter(i);
      counter = null;
      System.gc();
    }

  }
}
