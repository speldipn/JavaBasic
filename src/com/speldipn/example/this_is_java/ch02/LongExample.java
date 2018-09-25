package com.speldipn.example.this_is_java.ch02;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-25
 */
public class LongExample {
  public static void main(String[] args) {
    long var1 = 10;
    long var2 = 20L;
//    long var3 = 10000000000;  // 컴파일 에러
    long var3 = 10000000000L;

    System.out.println(var1);
    System.out.println(var2);
    System.out.println(var3);
  }
}
