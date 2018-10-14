package com.speldipn.example.java_ysw.ch17;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-11
 */

class __OuterClass {
  private String myName;
  public int num;

  __OuterClass(String name) {
    myName = name;
    num = 0;
  }

  public void whoAreYou() {
    ++num;
    System.out.println(myName + " __OuterClass " + num);
  }

  class InnerClass {
    public InnerClass() {
      whoAreYou();
    }
  }
}

public class InnerClassTest {
  public static void main(String[] args) {
    __OuterClass out1 = new __OuterClass("First");
    __OuterClass out2 = new __OuterClass("Second");
    out1.whoAreYou();
    out2.whoAreYou();

    __OuterClass.InnerClass inn1 = out1.new InnerClass();
    __OuterClass.InnerClass inn2 = out2.new InnerClass();
    __OuterClass.InnerClass inn3 = out1.new InnerClass();
    __OuterClass.InnerClass inn4 = out2.new InnerClass();
    __OuterClass.InnerClass inn5 = out2.new InnerClass();
  }
}
