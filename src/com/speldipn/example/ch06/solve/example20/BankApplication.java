package com.speldipn.example.ch06.solve.example20;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-20
 */
public class BankApplication {
  private static Account[] accountArray = new Account[100];
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    boolean run = true;

    while (run) {
      System.out.println("-----------------------------------------------");
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
      System.out.println("-----------------------------------------------");
      System.out.print("선택>");

      int selectNo = scanner.nextInt();
      if (selectNo == 1) {
        createAccount();
      } else if (selectNo == 2) {
        accountList();
      } else if (selectNo == 3) {
        deposit();
      } else if (selectNo == 4) {
        withdraw();
      } else if (selectNo == 5) {
        run = false;
      }
    }
    System.out.println("프로그램 종료.");
  }

  private static void createAccount() {
    for (int i = 0; i < accountArray.length; i++) {
      if (accountArray[i] == null) {
        System.out.print("계좌번호>");
        String ano = scanner.next();
        System.out.print("계좌주>");
        String owner = scanner.next();
        System.out.print("입금액>");
        int balance = scanner.nextInt();

        accountArray[i] = new Account(ano, owner, balance);
        System.out.println("계좌가 생성되었습니다. [" + ano + ", " + owner + ", " + balance + "]");
        break;
      }
    }
  }

  private static void accountList() {
    for (int i = 0; i < accountArray.length; i++) {
      if (accountArray[i] != null) {
        System.out.println("[" + i + "]: "
          + accountArray[i].getAno() + " "
        + accountArray[i].getOwner() + " "
        + accountArray[i].getBalance());
      }
    }
  }

  private static void deposit() {
    System.out.print("입금할 계좌번호>");
    String ano = scanner.next();
    Account acc = findAccount(ano);
    if(acc != null) {
      System.out.print("입금액>");
      int money = scanner.nextInt();
      money = acc.getBalance() + money;
      acc.setBalance(money);
      System.out.println("입금이 완료되었습니다. 잔액>" + acc.getBalance());
    } else {
      System.out.println("계좌를 찾을 수 없습니다.");
    }
  }

  private static void withdraw() {
    System.out.print("출금할 계좌번호>");
    String ano = scanner.next();
    Account acc = findAccount(ano);
    if(acc != null) {
      System.out.print("출금액>");
      int money = scanner.nextInt();
      money = acc.getBalance() - money;
      acc.setBalance(money);
      System.out.println("출금이 완료되었습니다. 잔액>" + acc.getBalance());
    } else {
      System.out.println("계좌를 찾을 수 없습니다.");
    }
  }

  private static Account findAccount(String ano) {
    for (int i = 0; i < accountArray.length; i++) {
      if (accountArray[i] != null) {
        if (ano.equals(accountArray[i].getAno())) {
          return accountArray[i];
        }
      }
    }
    return null;
  }
} // end of class