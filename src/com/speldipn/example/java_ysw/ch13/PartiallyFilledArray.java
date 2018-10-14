package com.speldipn.example.java_ysw.ch13;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-11
 */
public class PartiallyFilledArray {
  public static void main(String[] args) {
    int[][] arr = {
      {1, 2},
      {3, 4, 5},
      {6, 7, 8, 9}
    };

    System.out.println("row count : " + arr.length);

    for (int i = 0;i < arr.length; ++i) {
      System.out.printf("%d's count: %d \n", i+1, arr[i].length);
    }

  }
}
