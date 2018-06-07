package com.speldipn.example.ch04;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class BreakExample {
  public static void main(String[] args) {
    while(true) {
      int num = (int)(Math.random()*6) + 1;
      System.out.println(num);
      if(num == 6) {
        break;
      }
    }
    System.out.println("프로그램 종료.");
  }
}
