package com.speldipn.example.java_ysw.ch20;

import java.util.StringTokenizer;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-13
 */
public class TokenizeString {
  public static void main(String[] args) {
    String strData = "11:22:33:44:55";
    StringTokenizer st = new StringTokenizer(strData, ":");

    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }
}
