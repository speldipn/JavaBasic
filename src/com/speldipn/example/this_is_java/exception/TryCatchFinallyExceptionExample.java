package com.speldipn.example.this_is_java.exception;

public class TryCatchFinallyExceptionExample {
  public static void main(String[] args) {
    String data1 = null;
    String data2 = null;

    try {
      data1 = args[0];
      data2 = args[1];
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("실행 매개값의 수가 부족합니다.");
      System.out.println("실행 방법");
      System.out.println("java TryCatchFinallryRuntimeExceptionExample num1 num2");
      return;
    }

    try {
      int value1 = Integer.parseInt(data1);
      int value2 = Integer.parseInt(data2);
      int result = value1 + value2;
      System.out.println(value1 + "+" + value2 + "=" + result);
    } catch (Exception e) {
      System.out.println("숫자를 변환할 수 없습니다.");
    } finally {
      System.out.println("다시 실행하세요.");
    }
  }
}
