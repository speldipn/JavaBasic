package com.speldipn.example.this_is_java.ch12;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-10
 */
public class ThreadExitExample {
  public static void main(String[] args) {
    // 케이스 1
//    ExitThread1 thread1 = new ExitThread1();
//    thread1.start();
//    sleep(3000);
//    thread1.doStop();

    // 케이스 2
    ExitThread2 thread2 = new ExitThread2();
    thread2.start();
    sleep(3000);
    thread2.interrupt();

    // 케이스 3
//    ExitThread3 thread3 = new ExitThread3();
//    thread3.start();
//    sleep(3000);
//    thread3.interrupt();
  }

  private static void sleep(long msec) {
    try {
      Thread.sleep(msec);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  // 1. stop 플래그를 사용하여 종료하는 방식
  static class ExitThread1 extends Thread {
    boolean isStop;

    public ExitThread1() {
      setName("ExitThread1");
      isStop = false;
    }

    public void doStop() {
      isStop = true;
    }

    @Override
    public void run() {
      while (!isStop) {
        System.out.println(getName() + "실행중..");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }

  // 2. interrupt를 방생시켜서 종료하는 방식
  static class ExitThread2 extends Thread {
    public ExitThread2() {
      setName("ExitThread2");
    }

    @Override
    public void run() {
      try {
        while (true) {
          System.out.println(getName() + "실행중..");
          Thread.sleep(1);
        }
      } catch (InterruptedException e) {
      }
    }
  }

  // 3. static 메소들르 사용하여 종료하는 방식
  static class ExitThread3 extends Thread {
    public ExitThread3() {
      setName("ExitThread3");
    }

    @Override
    public void run() {
      while (true) {
        System.out.println(getName() + "실행중..");
        if (Thread.interrupted()) {
          break;
        }
      }
    }
  }

}
