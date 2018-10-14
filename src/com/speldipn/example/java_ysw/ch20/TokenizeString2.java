package com.speldipn.example.java_ysw.ch20;

import java.util.StringTokenizer;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-13
 */
public class TokenizeString2 {
  public static void main(String[] args) {
    String phoneNum = "TEL 82-02-9970-2059";
    String javaCode = "num+=1";

    System.out.println("First Result........");
    StringTokenizer st1 = new StringTokenizer(phoneNum);
    while(st1.hasMoreTokens()) {
      System.out.println(st1.nextToken());
    }

    System.out.println("\nSecond Result...........");
    StringTokenizer st2 = new StringTokenizer(phoneNum, " -");
    while (st2.hasMoreTokens()) {
      System.out.println(st2.nextToken());
    }

    System.out.println("\nThird Result............");
    // 세번째 인자는 구분자를 토큰으로 간주하는지 여부를 결정한다
    StringTokenizer st3 = new StringTokenizer(javaCode, "+=", true);
    while (st3.hasMoreTokens()) {
      System.out.println(st3.nextToken());
    }
  }
}
