package com.speldipn.example.this_is_java.ch05.solve;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class Example07 {
  public static void main(String[] args) {
    int max = 0;
    int[] array = {1, 5, 3, 8, 2};

    for(int i = 0; i < array.length; ++i) {
      if(array[i] > max) {
        max = array[i];
      }
    }

    System.out.println("최대값은 " + max); // 8
  }
}
