package com.speldipn.example.java_ysw.ch20;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-13
 */
public class UseWrapperClass {
  public static void showData(Object obj) {
    System.out.println(obj);
  }

  public static void main(String[] args) {
    Integer intInst = new Integer(3);
    showData(intInst);
    showData(new Integer(10));
  }
}
