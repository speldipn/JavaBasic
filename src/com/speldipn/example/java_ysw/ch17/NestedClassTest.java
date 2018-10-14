package com.speldipn.example.java_ysw.ch17;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-11
 */

class OuterClassOne {
  public OuterClassOne() {
    NestedClass nst = new NestedClass();
    nst.simpleMethod();
  }

  static class NestedClass {
    public void simpleMethod() {
      System.out.println("Nested Instance Method One");
    }
  }
}

class OuterClassTwo {
  OuterClassTwo() {
    NestedClass nst = new NestedClass();
    nst.simpleMethod();
  }

  private static class NestedClass {
    public void simpleMethod() {
      System.out.println("Nested Instance Method Two");
    }
  }
}

public class NestedClassTest {
  public static void main(String[] args) {
    OuterClassOne one = new OuterClassOne();
    OuterClassTwo two = new OuterClassTwo();

    OuterClassOne.NestedClass oneNest = new OuterClassOne.NestedClass();
    oneNest.simpleMethod();

//    private 으로 선언되었기 때문에 외부에서 생성이 불가능하다.
//    OuterClassTwo.NestedClass twoNest = new OuterClassTwo.NestedClass();
//    twoNest.simpleMethod();

  }
}
