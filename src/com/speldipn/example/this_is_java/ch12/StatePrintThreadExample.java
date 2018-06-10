package com.speldipn.example.this_is_java.ch12;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-10
 */
public class StatePrintThreadExample {
  public static void main(String[] args) {
    StatePrintThread thread = new StatePrintThread(new TargetThread());
    thread.start();
  }

  static class StatePrintThread extends Thread {
    TargetThread targetThread;

    public StatePrintThread(TargetThread obj) {
      this.targetThread = obj;
    }

    @Override
    public void run() {

      while(true) {
        State state = targetThread.getState();
        System.out.println("현재 쓰레드 상태: " + state);

        if (state == State.NEW) {
          targetThread.start();
        } else if (state == State.TERMINATED) {
          break;
        }

        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }

  static class TargetThread extends Thread {
    @Override
    public void run() {
      try {
        Thread.sleep(1500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      // TIME_WAITED가 종료되고 RUNNABLE 상태가 출력되기 위해서
      for(long i = 0; i < 1000000000L; ++i) {}
    }
  }
}
