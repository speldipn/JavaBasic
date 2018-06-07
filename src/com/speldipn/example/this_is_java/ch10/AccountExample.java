package com.speldipn.example.this_is_java.ch10;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-10
 */
public class AccountExample {
  public static void main(String[] args) {
    Account acc = new Account();
    acc.deposit(1000);
    System.out.println("예금액: " + acc.getBalance());
    try {
      acc.withdraw(2000);
    } catch (BalanceInsufficientException e) {
      String msg = e.getMessage();
      System.out.println(msg);
      System.out.println();
      e.printStackTrace();
    }
  }
}
