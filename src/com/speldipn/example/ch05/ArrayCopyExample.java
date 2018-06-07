package com.speldipn.example.ch05;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-18
 */
public class ArrayCopyExample {
  public static void main(String[] args) {
    String[] oldStrArray = {"java", "array", "copy"};
    String[] newStrArray = new String[5];

    System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

    for(int i = 0; i < newStrArray.length; ++i) {
      System.out.println("newStrArray[" + i + "] : " + newStrArray[i]);
    }

    for(int i = 0 ; i < oldStrArray.length; ++i) {
      System.out.println(oldStrArray[i] == newStrArray[i]);
    }
  }
}
