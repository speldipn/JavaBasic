package com.speldipn.example.this_is_java.ch10.solve;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-10
 */
public class NotExistIDException extends Exception {
  public NotExistIDException() {
  }

  public NotExistIDException(String message) {
    super(message);
  }
}
