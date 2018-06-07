package com.speldipn.example.this_is_java.ch06.access.test;

import com.speldipn.example.this_is_java.ch06.access.A;
import com.speldipn.example.this_is_java.ch06.access.A;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class C {
  A a1 = new A(true);
//  A a2 = new A(5); // default 권한이므로 다른 패키지에 있어 사용못함.
//  A a3 = new A("Hello");  // private이기 때문에 외부 클래스에서 접근불가.
  void func() {
    a1.field1 = 10;
//    a1.field2 = 20; default 권한이므로 다른 패키지에 있기 때문에 접근불가.
//    a1.field3 = 30; private 권한이므로 다른 클래스에서 접근불가.
  }
}
