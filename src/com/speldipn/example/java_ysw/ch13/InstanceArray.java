package com.speldipn.example.java_ysw.ch13;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-10
 */
public class InstanceArray {
  public static void main(String[] args) {
    String strs[] = new String[3];

    System.out.println(strs[0]);
    System.out.println(strs[1]);
    System.out.println(strs[2]);

    strs[0] = "Hello";
    strs[1] = "Joon";
    strs[2] = "Young";

    System.out.println(strs[0]);
    System.out.println(strs[1]);
    System.out.println(strs[2]);

    int arr[] = new int[3];

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
  }
}
