package com.speldipn.example.java_ysw.ch12;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-10
 */
public class StringScanning {
  public static void main(String[] args) {
    String source = "1 5 7";
    Scanner in = new Scanner(source);

    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();
    int sum = num1 + num2 + num3;

    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println("sum=" + sum);
  }
}
