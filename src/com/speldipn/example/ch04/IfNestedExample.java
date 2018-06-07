package com.speldipn.example.ch04;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class IfNestedExample {
  public static void main(String[] args) {
    int score = (int)(Math.random()*20) + 8;
    System.out.println("점수: " + score);

    String grade;

    if (score >= 90) {
      if (score >= 95) {
        grade = "A+";
      } else {
        grade = "A";
      }
    } else {
      if(score >= 85) {
        grade = "B+";
      } else {
        grade = "B";
      }
    }
    System.out.println("학점: " + grade);
  }
}
