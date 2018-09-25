package com.speldipn.example.this_is_java.ch02;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-25
 */
public class CharExample {
  public static void main(String[] args) {
    char c1 = 'A';
    char c2 = 65;
    char c3 = '\u0041';

    char c4 = '가';
    char c5 = 44032;
    char c6 = '\uac00';

    int uniCode = c1;

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);
    System.out.println(uniCode);

    // char c7 = '' // 컴파일 오류, 하나 이상 문자가 반드시 필요
    // String str = "" // 정상적으로 컴파일
  }

}
