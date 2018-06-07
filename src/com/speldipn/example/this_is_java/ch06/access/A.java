package com.speldipn.example.this_is_java.ch06.access;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class A {  // default
//  field
  public int field1;
  int field2;
  private int field3;

  A a1 = new A(true);
  A a2 = new A(1);
  A a3 = new A("Test");

  public A(boolean b) {
    field1 = 10;
    field2 = 11;
    field3 = 12;
  }
  A(int b) {}
  private A(String s) {}
}
