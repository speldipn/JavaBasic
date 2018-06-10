package com.speldipn.example.this_is_java.ch12;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-10
 */
public class ThreadNameExample {
  public static void main(String[] args) {
    Thread mainThread = Thread.currentThread();
    System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());

    ThreadA threadA = new ThreadA();
    System.out.println("작업스레드 이름: " + threadA.getName());

    ThreadB threadB = new ThreadB();
    System.out.println("작업스레드 이름: " + threadB.getName());

    threadA.start();
    threadB.start();

    try {
      threadB.join();
      threadA.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      System.out.println("Thread가 모두 소멸되었습니다.");
    }
  }

  private static class ThreadA extends Thread {
    public ThreadA() {
      setName("ThreadA");
    }

    @Override
    public void run() {
      for(int i = 0; i < 2; ++i) {
        System.out.println(getName() + "가 출력한 내용");
      }
    }
  }

  private static class ThreadB extends Thread {
    public ThreadB() {
      setName("ThreadB");
    }

    @Override
    public void run() {
      for(int i = 0; i < 2; ++i) {
        System.out.println(getName() + "가 출력한 내용");
      }
    }
  }
}
