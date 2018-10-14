package com.speldipn.example.java_ysw.ch13;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-11
 */
public class ArrayAndMethods {
  public static int[] addAllArray(int[] ar, int addVal) {
    for(int i = 0; i < ar.length; ++i) {
      ar[i] += addVal;
    }
    return ar;
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    int ref[];

    ref = addAllArray(arr, 1);

    if(arr == ref) {
      System.out.println("arr == ref");
    } else {
      System.out.println("arr != ref");
    }

    for(int i : ref) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
