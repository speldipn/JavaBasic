package com.speldipn.example.ch07.car;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
public class Car {

  Tire tire[] = new Tire[]{
    new Tire("앞왼쪽", 6),
    new Tire("앞오른쪽", 2),
    new Tire("뒤왼쪽", 3),
    new Tire("뒤오른쪽", 4)
  };

  int run() {
    System.out.println("[자동차가 달립니다.]");
    for (int i = 0; i < 4; ++i) {
      if(tire[i].roll() == false) {
        stop();
        return i + 1;
      }
    }
    return 0;
  }

  void stop() {
    System.out.println("[자동차가 멈춥니다.]");
  }
}
