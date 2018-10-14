package com.speldipn.example.java_ysw.ch17;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-11
 */

class _OuterClass {
  private String myName;

  public _OuterClass(String name) {
    this.myName = name;
  }

  public Readable createLocalClassInst(final int instId) {
    // 매개변수 final을 붙이지 않아도 되지만 컴파일러가 만든 복사본과의 일치를 위해서..
    class LocalClass implements Readable {
      @Override
      public void read() {
        System.out.println("Outer inst name : " + myName);
        System.out.println("Local Inst ID: " + instId);
      }
    }
    return new LocalClass();
  }
}

public class LocalParamClassTest {
  public static void main(String[] args) {
    _OuterClass out = new _OuterClass("My Outer Class");
    Readable localInst1 = out.createLocalClassInst(111);
    localInst1.read();

    Readable localInst2 = out.createLocalClassInst(222);
    localInst2.read();
  }
}
