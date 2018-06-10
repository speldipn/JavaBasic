package com.speldipn.example.this_is_java.ch12;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-11
 */
public class DaemonExample {
  public static void main(String[] args) {
    AutoSaveThread autoSaveThread = new AutoSaveThread();
    autoSaveThread.setDaemon(true); // 반드시 start 이전에 호출할것. 그렇지 않으면 IllegalThreadStateException 발생.
    autoSaveThread.start();
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("메인스레드 종료");
  }

  public static class AutoSaveThread extends Thread {
    public void save() {
      System.out.println("작업 내용을 저장함.");
    }

    @Override
    public void run() {
      while(true) {
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          break;
        }
        save();
      }
    }
  }
}
