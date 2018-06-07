package com.speldipn.example.this_is_java.ch05;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-18
 */
public class ArrayLengthExample {
  public static void main(String[] args) {
    int[] scores = {83, 90, 87};

    int sum = 0;
    for (int i = 0; i < scores.length; ++i) {
      sum += scores[i];
    }
    System.out.println("총합: " + sum);

    double avg = (double) sum / 3;
    System.out.println("평균: " + avg);
  }
}
