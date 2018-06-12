package com.speldipn.example.this_is_java.ch12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-11
 */
public class ExecuteExample {
  public static void main(String[] args) throws InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(2); // 최대 스레드 제한

    for (int i = 0; i < 10; ++i) {
      Runnable runnable = new Runnable() {
        @Override
        public void run() {
          ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
          int poolSize = threadPoolExecutor.getPoolSize();
          String threadName = Thread.currentThread().getName();
          System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름: " + threadName);
          // 예외 발생
          int value = Integer.parseInt("일");
        }
      };
//      executorService.execute(runnable);
      executorService.submit(runnable);
      Thread.sleep(1000);
    }
    executorService.shutdown();

  }
}
