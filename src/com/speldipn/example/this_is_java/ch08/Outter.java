package com.speldipn.example.this_is_java.ch08;

public class Outter {
  // 자바 7 이전
  public void method1(final int arg) {
    final int localVariable = 1;
    // arg = 100;
    // localVariable = 100;
    class Inner {
      public void method() {
        int result = arg + localVariable;
      }
    }
  }

  // 자바 8 이후
  public void method2(int arg) {
    int localVariable = 1;
    arg = 100;
    localVariable = 100;
    int finalarg = arg;
    int finalLocalVariable = localVariable;
    class Inner {
      public void method() {
        int result = finalarg + finalLocalVariable;
      }
    }
  }

  String field = "test.Outter-field";
  void method() {
    System.out.println("test.Outter-method.");
  }

  public class Nested {
    String field1 = "Nested-field";
    void method1() {
      System.out.println("Nested-method");
    }
    void print() {
      System.out.println(this.field1);
      this.method1();
      System.out.println(Outter.this.field);
      Outter.this.method();

    }
  }
}
