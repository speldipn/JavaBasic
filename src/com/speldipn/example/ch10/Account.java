package com.speldipn.example.ch10;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-10
 */
public class Account {
  private long balance;

  public Account() {
  }

  public long getBalance() {
    return balance;
  }

  public void deposit(int money) {
    balance += money;
  }

  public void withdraw(int money) throws BalanceInsufficientException {
    if(balance < money) {
      throw new BalanceInsufficientException("잔고부족:" + (money - balance) + "모자람");
    }
    balance -= money;
  }

  public static void main(String[] args) {
    Account acc = new Account();
    acc.deposit(1000);
    try {
      acc.withdraw(1100);
    } catch (BalanceInsufficientException e) {
//      String s = e.getMessage();
//      System.out.println("Message : " + s);
      e.printStackTrace();
    }
  }
}
