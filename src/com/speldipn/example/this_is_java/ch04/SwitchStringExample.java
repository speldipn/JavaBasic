package com.speldipn.example.this_is_java.ch04;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class SwitchStringExample {
  public static void main(String[] args) {
    String[] gradeArr = new String[]{"부장", "과장", "대리"};

    for (int i = 0; i < 10; ++i) {
      String position = gradeArr[(int) (Math.random() * 3)];
      switch (position) {
        case "부장":
          System.out.println("700만원");
          break;
        case "과장":
          System.out.println("500만원");
          break;
        default:
          System.out.println("300만원");
      }
    }
  }
}
