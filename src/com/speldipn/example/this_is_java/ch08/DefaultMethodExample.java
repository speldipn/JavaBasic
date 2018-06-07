package com.speldipn.example.this_is_java.ch08;

public class DefaultMethodExample {
  public static void main(String[] args) {
    MyInterface mi1 = new MyClassA();
    mi1.method();
    mi1.method2();

    MyInterface mi2 = new MyClassB();
    mi2.method();
    mi2.method2();

  }
}
