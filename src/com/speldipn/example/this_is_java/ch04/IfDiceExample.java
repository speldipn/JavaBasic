package com.speldipn.example.this_is_java.ch04;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class IfDiceExample {
  public static void main(String[] args) {
    int num = (int) (Math.random() * 6) + 1;

    for(int i = 0; i < 10; ++i) {
      System.out.print(Math.random());
      System.out.println(" " + Math.random() * 6);
    }

    if (num == 1) {
      System.out.println("1번이 나왔습니다.");
    } else if (num == 2) {
      System.out.println("2번이 나왔습니다.");
    } else if (num == 3) {
      System.out.println("3번이 나왔습니다.");
    } else if (num == 4) {
      System.out.println("4번이 나왔습니다.");
    } else if (num == 5) {
      System.out.println("5번이 나왔습니다.");
    } else {
      System.out.println("6번이 나왔습니다.");
    }
  }
}
