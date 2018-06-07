package com.speldipn.example.this_is_java.ch08;

public interface ParentInterface {
  public void method1();
  public default void method2() { /* 실행문 */ }
}
