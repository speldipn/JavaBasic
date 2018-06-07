package com.speldipn.example.this_is_java.ch05;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-18
 */
public class AdvancedForExample {
  public static void main(String[] args) {
    int[] scores = {95, 71, 84, 93, 87};

    int sum = 0;
    for (int score : scores) {
      sum += score;
    }

    System.out.println("점수 총합: " + sum);

    double avg = (double) sum / 5;
    System.out.println("점수 평균 : " + avg);

  }
}
