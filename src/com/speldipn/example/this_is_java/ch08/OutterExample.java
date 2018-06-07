package com.speldipn.example.this_is_java.ch08;

public class OutterExample {
  public static void main(String[] args) {
    Outter outter = new Outter();
    Outter.Nested nested = outter.new Nested();
    nested.print();
  }
}
