package com.speldipn.example.this_is_java.ch12;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-10
 */
public class WaitNotify1Example {
  public static void main(String[] args) {
    WorkObject sharedObject = new WorkObject();

    ThreadA threadA = new ThreadA(sharedObject);
    ThreadB threadB = new ThreadB(sharedObject);

    threadA.start();
    threadB.start();
  }

  private static class WorkObject {
    public synchronized void methodA() {
      System.out.println("ThreadA의 methodA() 작업 실행");
      notify(); // wake up thread that waiting state
      try {
        wait();
      } catch(Exception e) {

      }
    }

    public synchronized void methodB() {
      System.out.println("ThreadB의 methodB() 작업 실행");
      notify();
      try {
        wait();
      } catch(Exception e) {

      }
    }
  }

  private static class ThreadA extends Thread {
    private WorkObject workObject;

    public ThreadA(WorkObject workObject) {
      this.workObject = workObject;
    }

    @Override
    public void run() {
      for(int i = 0; i < 10; ++i) {
        workObject.methodA();
      }
    }
  }

  private static class ThreadB extends Thread {
    private WorkObject workObject;

    public ThreadB(WorkObject workObject) {
      this.workObject = workObject;
    }

    @Override
    public void run() {
      for(int i = 0; i < 10; ++i) {
        workObject.methodB();
      }
    }
  }
}
