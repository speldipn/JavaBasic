package com.speldipn.example.fc_java.Lambda;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-07-04
 */

// 중요: 람다를 사용하기 위해서는 람다로 설계된 객체에 하나의 함수만 존재해야 한다.
public class LambdaMain {
  public static void main(String[] args) {
    Runnable runnable = () -> {
          for(int i = 0; i < 10; ++i) {
            System.out.println(i);
          }
    };
    Thread thread =  new Thread(runnable);
    thread.start();

    CallBack callBack = System.out::println;

    CallBack callBack2 = new CallBack() {
      @Override
      public void print(String word) {
        System.out.println(word);
      }
    };
  }
}

interface CallBack {
  public void print(String word);
}