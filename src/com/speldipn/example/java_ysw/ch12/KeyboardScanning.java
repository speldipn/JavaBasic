package com.speldipn.example.java_ysw.ch12;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-10
 */
public class KeyboardScanning {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();
    int sum = num1 + num2 + num3;

    System.out.printf("%d + %d + %d = %d\n", num1, num2, num3, sum);
  }
}
