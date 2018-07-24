package com.speldipn.example.this_is_java.ch12;

import com.speldipn.example.this_is_java.ch12.StatePrintThreadExample.*;

import java.awt.*;


/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-10
 */
public class SleepExample {
  static class SleepThread extends Thread {
    @Override
    public void run() {
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      for(int i = 0; i < 3; ++i) {
        toolkit.beep();
        try{ Thread.sleep(3000); }catch(Exception e) {}
      }
    }
  }

  public static void main(String[] args) {
    StatePrintThread statePrintThread = new StatePrintThread(new SleepThread());
    statePrintThread.start();
  }
}
