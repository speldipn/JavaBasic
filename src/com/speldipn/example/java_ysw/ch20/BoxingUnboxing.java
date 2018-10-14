package com.speldipn.example.java_ysw.ch20;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-13
 */
public class BoxingUnboxing {
  public static void main(String[] args) {
    Integer iValue = new Integer(10);
    Double dValue = new Double(3.14);

    System.out.println(iValue);
    System.out.println(dValue);

    iValue = new Integer(iValue.intValue() + 10);
    dValue = new Double(dValue.doubleValue() + 1.2);

    System.out.println(iValue);
    System.out.println(dValue);
  }
}
