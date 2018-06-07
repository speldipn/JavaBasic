package com.speldipn.example.this_is_java.ch08;

public class Example {
  public static void main(String[] args) {
    ImplementationC imp = new ImplementationC();
    imp.methodA();
    imp.methodB();
    imp.methodC();
    System.out.println();

    InterfaceA a = imp;
    a.methodA();
    InterfaceB b = imp;
    b.methodB();
    InterfaceC c = imp;
    c.methodA();
    c.methodB();
    c.methodC();
  }
}
