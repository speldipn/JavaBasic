package com.speldipn.example.this_is_java.ch06.annotation;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class Service {
  @PrintAnnotation
  public void method1() {
    System.out.println("실험 내용1");
  }

  @PrintAnnotation("*")
  public void method2() {
    System.out.println("실험 내용2");
  }

  @PrintAnnotation(value="#", number=20)
  public void method3() {
    System.out.println("실험 내용3");
  }
}
