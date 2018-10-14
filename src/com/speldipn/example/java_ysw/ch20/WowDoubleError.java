package com.speldipn.example.java_ysw.ch20;

import java.math.BigDecimal;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-13
 */
public class WowDoubleError {
  public static void main(String[] args) {
    BigDecimal e1 = new BigDecimal(1.6);
    BigDecimal e2 = new BigDecimal(0.1);

    System.out.println("두 실수의 덧셈결과 : " + e1.add(e2));
    System.out.println("두 실수의 곱셈결과 : " + e1.multiply(e2));
  }
}