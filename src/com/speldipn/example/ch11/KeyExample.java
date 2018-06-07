package com.speldipn.example.ch11;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-12
 */
public class KeyExample {
  public static void main(String[] args) {
    String str1 = "hh";
    String str2 = "hh";
    String str3 = new String("hh");

    System.out.println(str1.equals(str2));
    System.out.println(str1.equals(str3));
    System.out.println(str1 == str2);
    System.out.println(str1 == str3);

    System.out.println(str1.hashCode());
    System.out.println(str2.hashCode());
    System.out.println(str3.hashCode());

  }
}
