package com.speldipn.example.ch11;

import java.util.Arrays;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-14
 */
public class ArrayCopyExample {
  public static void main(String[] args) {
    char[] arr1 = {'J', 'A', 'V', 'A'};
    System.out.println(arr1);

    // 방법1
    char[] arr2 = Arrays.copyOfRange(arr1, 1, 3);
    System.out.println(arr2);

    // 방법2
    char[] arr3 = new char[arr1.length];
    System.arraycopy(arr1, 0, arr3, 0, arr1.length);
    System.out.println(arr3);
  }
}
