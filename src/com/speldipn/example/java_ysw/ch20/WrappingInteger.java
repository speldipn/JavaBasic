package com.speldipn.example.java_ysw.ch20;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-12
 */
public class WrappingInteger {
  static class IntWrapper {
    private int num;
    public IntWrapper(int data) {
      num = data;
    }
    public String toString() {
      return super.toString();
//      return String.valueOf(num);
//      return "" + num;
    }
  }

  public static void showData(Object obj) {
    System.out.println(obj);
  }

  public static void main(String[] args) {
    IntWrapper intInst = new IntWrapper(3);
    showData(intInst);
    showData(new IntWrapper(7));
  }
}
