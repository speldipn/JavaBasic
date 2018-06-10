package com.speldipn.example.this_is_java.ch12;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-10
 */
public class JoinExample {
  public static void main(String[] args) {
    SumThread sumThread = new SumThread();
    sumThread.start();
    try {
      sumThread.join();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("1~100 합: " + sumThread.getSum());
  }

  static class SumThread extends Thread {
    private long sum;

    public long getSum() {
      return sum;
    }

    public void setSum(long sum) {
      this.sum = sum;
    }

    @Override
    public void run() {
      for(int i = 1; i <= 100; ++i) {
        this.sum += i;
      }
    }
  }
}
