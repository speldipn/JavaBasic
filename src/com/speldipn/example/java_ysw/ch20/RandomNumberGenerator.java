package com.speldipn.example.java_ysw.ch20;

import java.util.Random;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-13
 */
public class RandomNumberGenerator {
  public static void main(String[] args) {
    Random rand = new Random(12);

    for (int i = 0; i < 100; ++i) {
//      System.out.println(rand.nextInt(1000));
      System.out.println(rand.nextDouble()*10);
    }
  }
}
