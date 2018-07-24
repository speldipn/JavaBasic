package com.speldipn.example.this_is_java.ch12;

import java.awt.*;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-07-23
 */
public class BeepPrintExample1 {
  public static void main(String[] args) {
    Toolkit toolkit = Toolkit.getDefaultToolkit();

    for(int i = 0; i < 5; ++i) {
      toolkit.beep();
      try { Thread.sleep(500); } catch(Exception e) {}
    }

    for(int i = 0; i < 5; ++i) {
      System.out.println("띵");
      try { Thread.sleep(500); } catch(Exception e) {}
    }
  }
}
