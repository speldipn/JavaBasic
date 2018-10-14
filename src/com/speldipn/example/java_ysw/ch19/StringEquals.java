package com.speldipn.example.java_ysw.ch19;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-12
 */
public class StringEquals {
  public static void main(String[] args) {
    String str1 = new String("Hi my string");
    String str2 = new String("Hi my string");

    if (str1 == str2) {
      System.out.println("참조 대상이 동일합니다.");
    } else {
      System.out.println("참조 대상이 동일하지 않습니다.");
    }

    if (str1.equals(str2)) {
      System.out.println("인스턴스 내용이 동일합니다");
    } else {
      System.out.println("인스턴스 내용이 동일하지 않습니다");
    }
  }
}
