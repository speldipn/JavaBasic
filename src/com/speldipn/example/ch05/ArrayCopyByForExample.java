package com.speldipn.example.ch05;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-18
 */
public class ArrayCopyByForExample {
  public static void main(String[] args) {
    int[] oldIntArray = {1, 2, 3};
    int[] newIntArray = new int[5];

    for (int i = 0; i < oldIntArray.length; ++i) {
      newIntArray[i] = oldIntArray[i];
    }

    for(int i = 0; i < newIntArray.length; ++i) {
      System.out.println("newIntArray[" + i + "] : " + newIntArray[i]);
    }
  }
}
