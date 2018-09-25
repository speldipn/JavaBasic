package com.speldipn.example.this_is_java.ch02;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-25
 */
public class FromIntToFloat {
  public static void main(String[] args) {
    int num1 = 123456780;
    int num2 = 123456780;

    // float : 부호(1bit) + 지수(8bit) + 가수(23bit)
    // num2의 값은 float 가수 범위(23bit)로 표현이 불가능한 값
    float num3 = num2;
    // double num3 = num2 으로 캐스팅할 경우, 결과값은 0
    num2 = (int) num3;

    int result = num1 - num2;
    System.out.println(result);
  }
}
