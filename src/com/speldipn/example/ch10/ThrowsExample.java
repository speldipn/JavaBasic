package com.speldipn.example.ch10;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-10
 */
public class ThrowsExample {
  public static void main(String[] args) {
    try {
      findClass();
    } catch (ClassNotFoundException e) {
      System.out.println("Class not found");
    }

  }

  private static void findClass() throws ClassNotFoundException {
    Class clazz = Class.forName("java.lang.String2");
  }
}
