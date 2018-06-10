package com.speldipn.example.this_is_java.ch12;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-10
 */
public class CalcThread {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; ++i) {
      Thread th = new CalcThreadUnit("thread+" + i);
      if(i != 10) {
        th.setPriority(Thread.MIN_PRIORITY);
      } else {
        th.setPriority(Thread.MAX_PRIORITY);
      }
      th.start();
    }
  }

  static class CalcThreadUnit extends Thread {

    public CalcThreadUnit(String name) {
      this.setName(name);
    }

    @Override
    public void run() {
      for (int i = 0; i < 2000000000; ++i) {
      }
      System.out.println(this.getName() + "작업종료");
    }
  }
}
