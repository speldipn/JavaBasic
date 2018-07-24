package com.speldipn.example.fc_java.Builtin;

import java.util.Random;

public class Builtin {

  public static void main(String[] args) {
    //1. 내장클래스
    // System, String 처럼 Java에 이미
    // 2. 내장함수 - println(), length(), indexOf()
    double pi = 3.141592;
    System.out.println(pi);
    System.out.println(Math.ceil(pi)); // 올림 함수
    System.out.println(Math.floor(pi)); // 내림 함수
    System.out.println(Math.round(pi)); // round 반올림 함수
    System.out.println();

    System.out.println("[ Random Test ]");
    System.out.println(Math.random() * 10);
    Random random = new Random();
    System.out.println(random.nextInt(10));

    // 3. 라이브러리
    /*
     * Java에 기본적으로 포함되지 않는 클래스
     * 주로 3rd party 개발자들이 만들어서 제공한다.
     */
  }

}
