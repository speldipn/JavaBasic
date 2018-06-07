package com.speldipn.example.ch07.calc;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-20
 */
public class Computer extends  Calculator {
  @Override
  double  areaCircle(double r) {
    System.out.println("Computer 객체의 areaCircle() 실행");
    return Math.PI * r * r;
  }
}
