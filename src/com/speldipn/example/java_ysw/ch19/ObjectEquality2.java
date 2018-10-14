package com.speldipn.example.java_ysw.ch19;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-12
 */
public class ObjectEquality2 {
  static class IntNumber {
    int num;

    public IntNumber(int num) {
      this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
      if (this.num == ((IntNumber)obj).num)
        return true;
      else
        return false;
    }
  }

  public static void main(String[] args) {
    IntNumber num1 = new IntNumber(10);
    IntNumber num2 = new IntNumber(12);
    IntNumber num3 = new IntNumber(10);

    if (num1.equals(num2)) {
      System.out.println("num1과 num2는 동일한 정수");
    } else {
      System.out.println("num1과 num2는 다른 정수");
    }

    if (num1.equals(num3)) {
      System.out.println("num1과 num3는 동일한 정수");
    } else {
      System.out.println("num1과 num3는 다른 정수");
    }
  }
}
