package com.speldipn.example.java_ysw.ch18;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-11
 */
public class RuntimeException {
  public static void main(String[] args) {
    try {
      int[] arr = new int[3];
      arr[-1] = 20;
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }

    try {
      Object obj = new int[10];
      String str = (String)obj;
    } catch(ClassCastException e) {
      System.out.println(e.getMessage());
    }

    try {
      int arr[] = new int[-10];
    } catch (NegativeArraySizeException e) {
      System.out.println(e.getMessage());
    }

    try {
      String str = null;
      int len = str.length();
    } catch(NullPointerException e) {
      System.out.println(e.getMessage());
    }
  }
}
