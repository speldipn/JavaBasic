package com.speldipn.example.java_ysw.ch01;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-09
 */
public class Practice0101 {
  public static void solve(String[] args) {
    // 파일의 이름을 변경
    // FirstJavaProgram.java -> SimpleJavaProgram.java
  }

  public static void solve1(String[] args) {
    System.out.println("2+5=" + 2 + 5);
    System.out.println("2+5=" + (2 + 5));
  }

  public static void solve2(String[] args) {
    System.out.println(2 * 6);
    System.out.println(10 + 2);
    System.out.println(120 / 10);
    System.out.println(50 - 38);
    System.out.println(3 << 2);
  }

  public static void main(String[] args) {
    solve(args);
    System.out.println();
    solve1(args);
    System.out.println();
    solve2(args);
  }
}
