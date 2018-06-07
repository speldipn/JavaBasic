package com.speldipn.example.ch03.ch3;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class Exercise02 {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    int z = (++x) + (y--);
    System.out.println(z);

    // 정답은 31
  }
}
