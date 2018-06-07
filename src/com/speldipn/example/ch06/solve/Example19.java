package com.speldipn.example.ch06.solve;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-20
 */
class Account {
  static final int MIN_BALANCE = 0;
  static final int MAX_BALANCE = 1000000;
  private int balance;

  public void setBalance(int money) {
    if((money >= MIN_BALANCE) && (money <= MAX_BALANCE)) {
      balance = money;
    }
  }

  public int getBalance() {
    return balance;
  }
}

public class Example19 {
  public static void main(String[] args) {
    Account account = new Account();

    account.setBalance(10000);
    System.out.println("현재 잔고 : " + account.getBalance());

    account.setBalance(-100);
    System.out.println("현재 잔고 : " + account.getBalance());

    account.setBalance(2000000);
    System.out.println("현재 잔고 : " + account.getBalance());

    account.setBalance(300000);
    System.out.println("현재 잔고 : " + account.getBalance());
  }
}
