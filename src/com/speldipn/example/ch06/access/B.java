package com.speldipn.example.ch06.access;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class B {
  A a1 = new A(true);
  A a2 = new A(5);
//  A a3 = new A("Hello"); // private이므로 접근불가.
  void func() {
    a1.field1 = 10;
    a1.field2 = 20;
//    a1.field = 30; private 접근불가.
  }
}
