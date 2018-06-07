package com.speldipn.example.ch11.solve;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-17
 */
public class StringConvertExample {
  public static void main(String[] args) {
    String strData1 = "200";
    int intData1 = Integer.parseInt(strData1);
    System.out.println(intData1);

    int intData2 = 150;
    String strData2 = String.valueOf(150);
    System.out.println(strData2);
  }
}
