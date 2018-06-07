package com.speldipn.example.this_is_java.ch05;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-18
 */
public class ArrayCreateByValueListExample1 {
  public static void main(String[] args) {
    int[] scores = {83, 90, 87};

    System.out.println("scores[0]: " + scores[0]);
    System.out.println("scores[1]: " + scores[1]);
    System.out.println("scores[2]: " + scores[2]);

    int sum = 0;
    for (int i = 0; i < 3; ++i) {
      sum += scores[i];
    }
    System.out.println("총합: " + sum);
    double avg = (double) sum / 3;
    System.out.println("평균: " + avg);

//    String[] name = null;
//    name = new String[] {"오준영", "오자람", "김일환"};
  }
}
