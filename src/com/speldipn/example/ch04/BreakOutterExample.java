package com.speldipn.example.ch04;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class BreakOutterExample {
  public static void main(String[] args) {
    Outter: for(char upper='A'; upper <= 'Z'; ++upper) {
      for(char lower='a'; lower <= 'z'; ++lower) {
        System.out.println(upper + " " + lower);
        if(lower == 'g') {
          break Outter; // 라벨을 사용하게 되면 중첩된 최상위 for문까지도 종료된다.
        }
      }
    }
    System.out.println("프로그램 종료.");
  }
}
