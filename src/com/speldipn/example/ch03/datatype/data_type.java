package com.speldipn.example.ch03.datatype;

/**
 * @author Oh, Joon young (speldipn)
 * @since 2018-04-15
 */
public class data_type {
  public static void main(String[] args) {
    // 정수 리터럴
    System.out.println(0);
    System.out.println(75);
    System.out.println(-100);
    // 8진수
    System.out.println(02);
    System.out.println(-04);

    // 실수 리터럴
    System.out.println(0.25);
    System.out.println(-3.14);
    // E 또는 e가 있는 리터럴 (지수와 가수)
    System.out.println(5E7);
    System.out.println(0.12E-5);

    // 문자 리터럴
    System.out.println('A');
    System.out.println('한');
    // 이스케이프 문자
    System.out.println('\t');
    System.out.println('\n');

    // 문자열 리터럴
    System.out.println("대한민국");
    System.out.println("탭 만큼 \t 합니다");
    System.out.println("한줄 내려 쓰기 \n 합니다");

    // 논리 리터럴(boolean)
    System.out.println(true);
    System.out.println(false);

    // 변수값 읽기
    int value = 30;
    int result = value + 10;
    System.out.println("value: " + value);
    System.out.println("result: " + result);
  }
}
