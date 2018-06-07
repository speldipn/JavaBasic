package com.speldipn.example.this_is_java.ch08;

public class TestA {
  int field1;
  void method1() {}

  static int field2;
  static void method2() {}

  class B {
    void method() {
      field1 = 10;
      method1();

      field2 = 10;
      method2();
    }
  }

  static class C {
    void method() {
      field2 = 10;
      method2();
    }
  }
}
