package com.speldipn.example.ch03.ch3;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class Exercise08 {
  public static void main(String[] args) {
    double x = 5.0;
    double y = 0.0;

    double z = x % y;

    if(Double.isNaN(z)) {
      System.out.println("0.0으로 나눌 수 없습니다.");
    } else {
      double result = z + 10;
      System.out.println("결과: " + result);
    }
  }
}
