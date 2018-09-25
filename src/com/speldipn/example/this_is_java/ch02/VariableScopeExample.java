package com.speldipn.example.this_is_java.ch02;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-25
 */
public class VariableScopeExample {
  public static void main(String[] args) {
    int v1 = 15;
    if (v1 > 10) {
      int v2 = v1 - 10;
    }
//    int v3 = v1 =+ v2 + 5; // compile error
  }
}
