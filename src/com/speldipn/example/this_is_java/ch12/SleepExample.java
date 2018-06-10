package com.speldipn.example.this_is_java.ch12;

import java.awt.*;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-10
 */
public class SleepExample {
  public static void main(String[] args) {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    for(int i = 0; i < 3; ++i) {
      toolkit.beep();
      try{
        Thread.sleep(3000);
      }catch(Exception e) {
        System.out.println("SleepExample: " + e.getMessage());
      }
    }
  }
}
