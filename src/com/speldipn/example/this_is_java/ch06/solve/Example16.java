package com.speldipn.example.this_is_java.ch06.solve;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-20
 */
class Printer {
  static void println(int i) {
    System.out.println(i);
  }
  static void println(boolean b) {
    System.out.println(b);
  }
  static void println(double d) {
    System.out.println(d);
  }
  static void println(String s) {
    System.out.println(s);
  }
}

public class Example16 {
  public static void main(String[] args) {
    Printer.println(10);
    Printer.println(true);
    Printer.println(5.7);
    Printer.println("홍길동");
  }
}
