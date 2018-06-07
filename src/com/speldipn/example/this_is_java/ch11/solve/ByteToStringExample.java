package com.speldipn.example.ch11.solve;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-16
 */
public class ByteToStringExample {
  public static void main(String[] args) {
    byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
    String str = new String(bytes);
    System.out.println(str);
  }
}
