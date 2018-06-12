package com.speldipn.example.this_is_java.ch12;

import java.util.concurrent.*;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-11
 */
public class ResultByRunnableExample {
  public static void main(String[] args) {
    ExecutorService executorService =
      Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    System.out.println("[작업 처리 요청]");
    class Task implements Runnable {
      Result result;

      Task(Result result) {
        this.result = result;
      }

      @Override
      public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; ++i) {
          sum += i;
        }
        result.addValue(sum);
      }
    }

    Result result = new Result();
    Runnable task1 = new Task(result);
    Runnable task2 = new Task(result);
    Future<Result> future1 = executorService.submit(task1, result);
    Future<Result> future2 = executorService.submit(task2, result);

    try {
      result = future1.get();
      result = future2.get();
      System.out.println("[처리 결과] " + result.accumValue);
      System.out.println("[작업 처리 완료]");
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
      System.out.println("[실행 예외 발생함] " + e.getMessage());
    }

    executorService.shutdown();
  }
}

class Result {
  int accumValue;

  synchronized void addValue(int value) {
    accumValue += value;
  }
}
