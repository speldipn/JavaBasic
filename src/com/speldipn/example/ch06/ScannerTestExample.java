package com.speldipn.example.ch06;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-20
 */
public class ScannerTestExample {
  public static void main(String[] args) {
    Scanner s1 = new Scanner("\n\njoon\nyoung\n");
    while(s1.hasNext()) {
      System.out.println("출력: [" + s1.next() + "]");
    }
    System.out.println("==============================");
    Scanner s2 = new Scanner("\n\njoon\nyoung\n");
    while(s2.hasNext()) {
      System.out.println("출력: [" + s2.nextLine() + "]");
    }
  }
}
