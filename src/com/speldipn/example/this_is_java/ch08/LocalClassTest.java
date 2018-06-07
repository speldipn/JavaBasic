package com.speldipn.example.this_is_java.ch08;

public class LocalClassTest {
  public static void method1() {
    class LocalTest {
      public void method2() {
        System.out.println("LocalTest-method2()");
      }
    }
    LocalTest t = new LocalTest();
    t.method2();
  }

  public static void main(String[] args) {
    method1();

  }
}
