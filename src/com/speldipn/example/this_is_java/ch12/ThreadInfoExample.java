package com.speldipn.example.this_is_java.ch12;

import java.util.Map;
import java.util.Set;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-11
 */
public class ThreadInfoExample {
  public static void main(String[] args) {
    DaemonExample.AutoSaveThread autoSaveThread = new DaemonExample.AutoSaveThread();
    autoSaveThread.setName("AutoSaveThread");
    autoSaveThread.setDaemon(true);
    autoSaveThread.start();

    Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
    Set<Thread> threads = map.keySet();
    for(Thread thread: threads) {
      System.out.println("Name: " + thread.getName() +
        ((thread.isDaemon() ? "(대몬)" : "(주)")));
      System.out.println("\t" + "소속그룹: " + thread.getThreadGroup().getName());
      System.out.println();
    }

  }
}
