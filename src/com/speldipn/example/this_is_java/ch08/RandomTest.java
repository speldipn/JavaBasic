package com.speldipn.example.this_is_java.ch08;

import java.util.Random;

public class RandomTest {
  public static void main(String[] args) {
//    Random random = new Random(Calendar.getInstance().getTimeInMillis());
    Random random = new Random();
    for(int i = 0; i < 100; ++i) {
      System.out.println((int)(random.nextFloat()*5));
    }
  }
}
