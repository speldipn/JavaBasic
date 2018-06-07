package com.speldipn.example.this_is_java.ch03.ch3;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class Exercise03 {
  public static void main(String[] args) {
    int score = 85;
    String result = (!(score>90)) ? "가" : "나";
    System.out.println(result);

    // 정답은 '가'
  }
}
