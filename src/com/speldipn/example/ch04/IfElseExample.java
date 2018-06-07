package com.speldipn.example.ch04;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class IfElseExample {
  public static void main(String[] args) {
    int score = 85;

    if (score >= 90) {
      System.out.println("점수가 90보다 큽니다.");
      System.out.println("등급은 A 입니다.");
    } else {
      System.out.println("점수가 90보다 작습니다.");
      System.out.println("등급은 B 입니다.");
    }
  }

}
