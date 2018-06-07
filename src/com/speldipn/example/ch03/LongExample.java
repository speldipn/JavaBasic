package com.speldipn.example.ch03;

/**
 * @author Oh, Joon young (speldipn)
 * @since 2018-04-15
 */
public class LongExample {
  public static void main(String[] args) {
    long var1 = 10;
    long var2 = 20L;
//    long var3 = 1000000000000; 컴파일 에러
    long var3 = 1000000000000L; // int의 범위를 넘어서는경우 L을 표기해야됨. 자바는 타입에 민감한 언어이다.

    System.out.println(var1);
    System.out.println(var2);
    System.out.println(var3);

  }
}
