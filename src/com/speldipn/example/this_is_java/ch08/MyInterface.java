package com.speldipn.example.this_is_java.ch08;

public interface MyInterface {
  public void method();
  public default void method2() {
    System.out.println("test.MyInterface-method2 실행.");
  }
}
