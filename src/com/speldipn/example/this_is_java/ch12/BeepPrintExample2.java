package com.speldipn.example.this_is_java.ch12;

import java.awt.*;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-07-23
 */
public class BeepPrintExample2 {
  public static void main(String[] args) {
    Runnable beepTask = new BeepTask();
    Thread beep = new Thread(beepTask);
    beep.start();

    for (int i = 0; i < 5; ++i) {
      System.out.println("띵");
      try { Thread.sleep(500); } catch (Exception e) {}
    }
  }

  private static class BeepTask implements Runnable {
    @Override
    public void run() {
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      for (int i = 0; i < 5; ++i) {
        toolkit.beep();
        try { Thread.sleep(500); } catch (Exception e) {}
      }
    }
  }
}
