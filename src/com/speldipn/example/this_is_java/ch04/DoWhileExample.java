package com.speldipn.example.this_is_java.ch04;

import java.util.Scanner;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class DoWhileExample {
  public static void main(String[] args) {
    System.out.println("메세지를 입력하세요");
    System.out.println("프로그램을 종료하려면 q를 입력하세요.");

    Scanner scanner = new Scanner(System.in);
    String inputString;

    do {
      System.out.print(">");
      inputString = scanner.nextLine();
      System.out.println(inputString);
    } while (!inputString.equals("q"));

    System.out.println();
    System.out.println("프로그램 종료.");
  }
}
