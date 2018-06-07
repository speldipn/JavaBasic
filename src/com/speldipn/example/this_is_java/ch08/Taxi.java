package com.speldipn.example.this_is_java.ch08;

public class Taxi implements Vehicle {
  @Override
  public void run() {
    System.out.println("택시가 달립니다.");
  }

  public void checkPassanger() {
    System.out.println("승객을 확인합니다.");
  }
}
