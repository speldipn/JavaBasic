package com.speldipn.example.ch11.solve;

import java.util.StringTokenizer;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-16
 */
public class SplitExample {
  public static void main(String[] args) {
    String str = "아이디,이름,패스워드";

    System.out.println("[split]");
    // split
    String[] tokens = str.split(",");
    for(String s: tokens) {
      System.out.println(s);
    }
    System.out.println();

    System.out.println("[StringTokenizer]");
    // StringTokenizer
    StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
    while(stringTokenizer.hasMoreElements()) {
      String s = (String)stringTokenizer.nextElement();
      System.out.println(s);
    }
  }
}
