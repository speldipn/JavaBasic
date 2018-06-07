package com.speldipn.example.this_is_java.exception;

public class TryCatchFinallyExample {
  public static void main(String[] args) {
    try {
      Class clazz = Class.forName("java.lang.String");
    } catch (ClassNotFoundException e) {
      System.out.println("클래스가 존재하지 않습니다.");
    }
  }
}
