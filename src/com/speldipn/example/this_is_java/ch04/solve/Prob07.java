package com.speldipn.example.this_is_java.ch04.solve;

import java.util.Scanner;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-17
 */
public class Prob07 {
  public static void main(String[] args) {
    int balance = 0;
    boolean run = true;
    Scanner scanner = new Scanner(System.in);

    while (run) {
      showMenu();
      switch (scanner.nextLine()) {
        case "1":
          System.out.print("입금액: ");
          try {
            balance += Integer.valueOf(scanner.nextLine());
          } catch (Exception e) {
            System.out.println("잘못된 값을 입력하셨습니다.");
          }
          break;
        case "2":
          System.out.print("출금액: ");
          try {
            balance -= Integer.valueOf(scanner.nextLine());
            System.out.println("잘못된 값을 입력하셨습니다.");
          } catch (Exception e) {
            System.out.println("잘못된 값을 입력하셨습니다.");
          }
          break;
        case "3":
          System.out.println("잔액은 " + balance + "입니다.");
          break;
        case "4":
          run = false;
          break;
        default:
      }
    }
    System.out.println("프로그램 종료.");
  }

  public static void showMenu() {
    System.out.println("===============================");
    System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
    System.out.println("===============================");
    System.out.print(">");
  }
}
