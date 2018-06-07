package com.speldipn.example.ch11;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-12
 */
public class Counter {
  private int no;

  public Counter(int no) {
    this.no = no;
  }

  @Override
  protected void finalize() throws Throwable {
    System.out.println(no + "번 객체의 finalize()가 실행됨");

  }
}
