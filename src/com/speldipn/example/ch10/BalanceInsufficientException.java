package com.speldipn.example.ch10;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-10
 */
public class BalanceInsufficientException extends Exception {

  public BalanceInsufficientException() {
  }

  public BalanceInsufficientException(String message) {
    super(message);
  }
}
