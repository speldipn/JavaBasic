package com.speldipn.example.this_is_java.ch05.solve;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class Example08 {
  public static void main(String[] args) {
    int[][] array = {
      {95, 86},
      {83, 92, 96},
      {78, 83, 93, 87, 88}
    };

    int sum = 0;
    double avg = 0.0;

    int total = 0;
    for(int i = 0; i < array.length; ++i) {
      for(int k = 0; k < array[i].length; ++k) {
        sum += array[i][k];
        total += 1;
      }
    }

    avg = (double)sum / total;

    System.out.println("총합은 " + sum);
    System.out.println("평균은 " + avg);
  }
}
