package com.speldipn.example.ch04;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class IfExample {
  public static void main(String[] args) {
    int score = 93;

    if (score >= 90) {
      System.out.println("점수가 90보다 큽니다.");
      System.out.println("등급은 A 등급입니다.");
    }

    if (score < 90) {
      System.out.println("점수가 90보다 작습니다.");
      System.out.println("등급은 B 등급입니다.");
    }
  }
}
