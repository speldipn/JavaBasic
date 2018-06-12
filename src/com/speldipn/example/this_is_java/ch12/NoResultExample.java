package com.speldipn.example.this_is_java.ch12;

import java.util.concurrent.*;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-11
 */
public class NoResultExample {

  public static void main(String[] args) {
    ExecutorService executorService =
      Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; ++i) {
          sum += i;
        }
        System.out.println("total: " + sum);
      }
    };
    Future future = executorService.submit(runnable);
    try {
      future.get();
      System.out.println("[ success exit ]");
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }

    executorService.shutdown();
  }

}
