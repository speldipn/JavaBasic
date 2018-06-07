package com.speldipn.example.this_is_java.ch04.solve;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class Prob04 {
  public static void main(String[] args) {
    while(true) {
      int num1 = getDice();
      int num2 = getDice();
      if(num1 == num2) {
        continue;
      } else {
        System.out.println("(" + num1 + ", " + num2 + ")");
        if((num1 + num2) == 5) {
          break;
        }
      }
    }
    System.out.println("프로그램 종료.");
  }

  public static int getDice() {
    int value = (int)((Math.random()*6) + 1);
    return value;
  }

}
