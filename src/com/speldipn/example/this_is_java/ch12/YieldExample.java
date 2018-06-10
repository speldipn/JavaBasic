package com.speldipn.example.this_is_java.ch12;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-10
 */
public class YieldExample {
  public static void main(String[] args) {
    ThreadA threadA = new ThreadA();
    ThreadB threadB = new ThreadB();

    threadA.start();
    threadB.start();

    try { Thread.sleep(3000); } catch(Exception e) {}
    threadA.work = false;

    try { Thread.sleep(3000); } catch(Exception e) {}
    threadA.work = true;

    try { Thread.sleep(3000); } catch(Exception e) {}
    threadA.stop = true;
    threadB.stop = true;

  }

  public static class ThreadA extends Thread {
    public boolean work = true;
    public boolean stop = false;
    int count = 0;

    @Override
    public void run() {
      while(!stop) {
        if(work) {
          System.out.println("ThreadA 작업");
          ++count;
        } else {
          Thread.yield();
        }
      }
      System.out.println("ThreadA 종료 - "  + count);
    }
  }

  private static class ThreadB extends Thread {
    public boolean work = true;
    public boolean stop = false;
    int count = 0;

    @Override
    public void run() {
      while (!stop) {
        if (work) {
          System.out.println("ThreadB 작업");
          ++count;
        } else {
          Thread.yield();
        }
      }
      System.out.println("ThreadB 종료 - " + count);
    }
  }
}
