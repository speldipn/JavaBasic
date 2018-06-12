package com.speldipn.example.this_is_java.ch12;

import java.util.concurrent.*;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-11
 */
public class ResultByCallableExample {
  public static void main(String[] args) {
    ExecutorService executorService =
      Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    System.out.println("[작업 처리 요청]");
    Callable<Integer> task = new Callable<>() {
      @Override
      public Integer call() throws Exception {
        int sum = 0;
        for(int i = 1; i <= 10; ++i) {
          sum += i;
        }
        return sum;
      }
    };
    Future future = executorService.submit(task);
    try {
      System.out.println("[작업 완료]");
      Integer result = (Integer)future.get();
      System.out.println("결과 : " + result);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }

    executorService.shutdown();
  }

}
