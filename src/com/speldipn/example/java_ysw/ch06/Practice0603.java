package com.speldipn.example.java_ysw.ch06;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-10
 */
public class Practice0603 {
  public static int solve(int n) {
    int result = 1;

    if (n == 0) {
      return 1;
    } else {
      return 2 * solve(n - 1);
    }
  }

  public static void solve1(int n) {
    if (n > 0) {
      solve1(n / 2);
      System.out.print(n % 2);
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(solve(5));
    solve1(10);
    System.out.println();
  }
}
