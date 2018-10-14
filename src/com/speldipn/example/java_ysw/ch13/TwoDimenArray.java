package com.speldipn.example.java_ysw.ch13;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-11
 */
public class TwoDimenArray {
  public static void main(String[] args) {
    int arr[][] = new int[3][4];

    for (int i = 0; i < 3; ++i) {
      for (int j = 0; j < 4; ++j) {
        arr[i][j] = i + j;
      }
    }

    for(int i = 0; i < 3; ++i) {
      for (int j = 0; j < 4; ++j) {
        System.out.println("( " + i + "," + j + " ) = " + arr[i][j]);
      }
    }
  }
}
