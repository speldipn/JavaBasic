package com.speldipn.example.java_ysw.ch13;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-10
 */
public class AccessArray {
  public static void main(String[] args) {
    int arr[] = new int[3];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;

    int sum  = arr[0] + arr[1] + arr[2];
    System.out.println("sum=" + sum);
  }
}
